/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
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

package back;

import back.macro.MCommaSeparator;
import back.macro.MEmptyMacro;
import back.macro.Macro;
import back.macro.Macros;

public class Separator {

    public static void main(
                String[] args){

        Macros m = new Macros();
        MEmptyMacro mEmptyMacro = m.newEmptyMacro();
        MCommaSeparator mCommaSeparator = m.newCommaSeparator();
        mCommaSeparator.addX(mEmptyMacro);
        mCommaSeparator.addX(mEmptyMacro);
        mCommaSeparator.addX(mEmptyMacro);
        System.out.println(mCommaSeparator.build());
    }

}
