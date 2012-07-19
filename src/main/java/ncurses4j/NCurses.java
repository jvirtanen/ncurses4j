/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ncurses4j;

import com.sun.jna.NativeLibrary;
import com.sun.jna.ptr.IntByReference;

public interface NCurses {
    short COLOR_BLACK   = 0;
    short COLOR_RED     = 1;
    short COLOR_GREEN   = 2;
    short COLOR_YELLOW  = 3;
    short COLOR_BLUE    = 4;
    short COLOR_MAGENTA = 5;
    short COLOR_CYAN    = 6;
    short COLOR_WHITE   = 7;

    GlobalIntVariable COLOR_PAIRS = new GlobalIntVariable("COLOR_PAIRS");
}
