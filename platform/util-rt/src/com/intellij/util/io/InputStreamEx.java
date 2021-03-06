// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.util.io;

import com.intellij.ReviseWhenPortedToJDK;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@ApiStatus.Internal
public interface InputStreamEx {
  @NotNull
  @ReviseWhenPortedToJDK("9") // there's is java.io.InputStream.readAllBytes
  byte [] readAllBytes() throws IOException;
}
