package com.wisnu.kurniawan.livedatapg

class MainViewModel : BaseViewModel<State, Effect>(State.State1) {

    fun updateEffect1() {
        setEffect(Effect.Effect1)
    }

    fun updateEffect2() {
        setEffect(Effect.Effect2)
    }

}
