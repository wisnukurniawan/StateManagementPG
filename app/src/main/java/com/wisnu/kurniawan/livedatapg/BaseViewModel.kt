package com.wisnu.kurniawan.livedatapg

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<S : BaseState, E : BaseEffect>(private val initialState: S) : ViewModel() {

    private val _state = MutableLiveData<S>(initialState)

    private val _effect = SingleLiveEvent<E>()

    val state: LiveData<S> = _state

    val effect: LiveData<E> = _effect

    protected fun setState(newState: S) {
        _state.value = newState
    }

    protected fun setEffect(newState: E) {
        _effect.value = newState
    }

    fun stateValue(): S {
        return state.value ?: initialState
    }

}
