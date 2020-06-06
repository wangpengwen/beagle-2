/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.zup.beagle.widget.layout

import br.com.zup.beagle.core.LayoutComponent
import br.com.zup.beagle.core.ServerDrivenComponent
import com.autodsl.annotation.AutoDsl

/**
 *  The horizontal component is a specialized container that will display its children horizontally.
 *
 * @param children define a list of components to be displayed on this view
 * @param reversed
 *                   The reversed attribute will change the children display direction.
 *                   By default it is set as null and it will display components from LEFT to RIGHT.
 *                   If you set this attribute to TRUE the display orientation will change from RIGHT to LEFT.
 *
 */

@AutoDsl
data class Horizontal(
    val children: List<ServerDrivenComponent>,
    val reversed: Boolean? = null
) : ServerDrivenComponent, LayoutComponent
