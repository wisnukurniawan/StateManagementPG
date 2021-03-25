package com.wisnu.kurniawan.livedatapg.main

import com.wisnu.kurniawan.livedatapg.base.ViewModelStateful

class MainViewModel : ViewModelStateful<MainState, MainEffect>(MainState()) {

    fun updateState1() {
        setState { copy(flag1 = true) }
    }

    fun updateState2() {
        setState { copy(flag2 = true) }
    }

    fun updateState3() {
        setState { MainState(flag1 = false, flag2 = false) }
    }

    fun updateEffect1() {
        setEffect(MainEffect.Effect1)
    }

    fun updateEffect2() {
        setEffect(MainEffect.Effect2)
    }

}
