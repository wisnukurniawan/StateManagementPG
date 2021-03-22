package com.wisnu.kurniawan.livedatapg.main

import com.wisnu.kurniawan.livedatapg.base.BaseViewModel

class MainViewModel : BaseViewModel<State, Effect>(State()) {

    fun updateState1() {
        setState { copy(flag1 = true) }
    }

    fun updateState2() {
        setState { copy(flag2 = true) }
    }

    fun updateState3() {
        setState { State(flag1 = false, flag2 = false) }
    }

    fun updateEffect1() {
        setEffect(Effect.Effect1)
    }

    fun updateEffect2() {
        setEffect(Effect.Effect2)
    }

}
