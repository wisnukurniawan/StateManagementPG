package com.wisnu.kurniawan.livedatapg.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wisnu.kurniawan.livedatapg.utils.SingleLiveEvent

abstract class BaseViewModel<S : BaseState, E : BaseEffect>(private val initialState: S) : ViewModel() {

    private val _state = MutableLiveData<S>(initialState)

    private val _effect = SingleLiveEvent<E>()

    val state: LiveData<S> = _state

    val effect: LiveData<E> = _effect

    protected fun setState(newState: S.() -> S) {
        _state.value = stateValue().newState()
    }

    protected fun setEffect(newEffect: E) {
        _effect.value = newEffect
    }

    fun stateValue(): S {
        return state.value ?: initialState
    }

}
