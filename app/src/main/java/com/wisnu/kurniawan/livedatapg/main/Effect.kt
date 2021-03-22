package com.wisnu.kurniawan.livedatapg.main

import com.wisnu.kurniawan.livedatapg.base.BaseEffect

sealed class Effect : BaseEffect {
    object Effect1 : Effect()
    object Effect2 : Effect()
}
