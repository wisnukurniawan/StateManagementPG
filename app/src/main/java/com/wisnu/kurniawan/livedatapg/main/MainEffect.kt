package com.wisnu.kurniawan.livedatapg.main

import com.wisnu.kurniawan.livedatapg.base.Effect

sealed class MainEffect : Effect {
    object Effect1 : MainEffect()
    object Effect2 : MainEffect()
}
