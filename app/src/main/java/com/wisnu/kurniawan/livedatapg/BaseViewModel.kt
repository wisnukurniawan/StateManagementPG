package com.wisnu.kurniawan.livedatapg

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<S : BaseState, E : BaseEffect>(initialState: S, initialEffect: E) : ViewModel() {

    private val _state = MutableLiveData<S>(initialState)

    private val _effect = SingleLiveEvent<E>(initialEffect)

    val state: LiveData<S> = _state

    val effect: LiveData<E> = _effect

    protected fun setState(newState: S.() -> S) {
        _state.value = _state.value?.newState()
    }

    protected fun setEffect(newEffect: E.() -> E) {
        _effect.value = _effect.value?.newEffect()
    }

}
