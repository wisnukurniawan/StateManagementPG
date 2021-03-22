package com.wisnu.kurniawan.livedatapg

class MainViewModel : BaseViewModel<State, Effect>(State(), Effect.Uninitialized) {

    fun updateState1() {
        setState { copy(flag1 = true) }
    }

    fun updateState2() {
        setState { copy(flag2 = true) }
    }

    fun updateEffect1() {
        setEffect { Effect.Effect1 }
    }

    fun updateEffect2() {
        setEffect { Effect.Effect2 }
    }

}
