// Copyright (C) 2015 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.server.account;

import com.google.gerrit.reviewdb.client.AccountGroup.UUID;
import com.google.gerrit.server.IdentifiedUser;

public abstract class AbstractGroupBackend implements GroupBackend {

  @Override
  public boolean memberOfAny(IdentifiedUser user, Iterable<UUID> ids) {
    return membershipsOf(user).containsAnyOf(ids);
  }
}
