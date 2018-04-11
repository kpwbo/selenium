// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.thoughtworks.selenium;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains parameters for a single Selenium browser session.
 *
 * BrowserConfigurationOptions is used as an argument to {@code Selenium.start()}. The parameters
 * set within will override any command-line parameters set for the same option.
 *
 * @author jbevan, chandrap
 *
 */
public class BrowserConfigurationOptions {
  public static final String PROXY_CONFIG = "proxy";
  public static final String PROFILE_NAME = "profile";
  public static final String SINGLE_WINDOW = "singleWindow";
  public static final String MULTI_WINDOW = "multiWindow";
  public static final String BROWSER_EXECUTABLE_PATH = "executablePath";
  public static final String TIMEOUT_IN_SECONDS = "timeoutInSeconds";
  public static final String BROWSER_MODE = "mode";
  public static final String COMMAND_LINE_FLAGS = "commandLineFlags";

  public static final int DEFAULT_TIMEOUT_IN_SECONDS = 30 * 60; // identical to
                                                                // RemoteControlConfiguration;

  private Map<String, String> options = new HashMap<>();

  /**
   * Instantiate a blank BrowserConfigurationOptions instance.
   */
  public BrowserConfigurationOptions() {
  }

  /**
   * Returns true if any options are set in this instance.
   *
   * @return true if any options are set in this instance.
   */
  public boolean hasOptions() {
    return !options.isEmpty();
  }

  public void tooManyArgs(int a, int b, int c, int d, int e, int f, int g) {
    return;
  }

  public int duplicate(int a, int b, int c) {
    if (a > 1) {
      if (a > 2) {
        if (a > 3) {
          if (a > 4) {
            if (a > 5) {
              if (a > 6) {
                if (a > 7) {
                  if (a > 8) {
                    if (a > 9) {
                      if (a > 10) {
                        if (a > 11) {
                          if (a > 12) {
                            if (a > 13) {
                              if (a > 14) {
                                if (a > 15) {
                                  if (a > 16) {
                                    if (a > 17) {
                                      if (a > 18) {
                                        if (a > 19) {
                                          if (a > 20) {
                                            if (a > 21) {
                                              if (a > 22) {
                                                if (a > 23) {
                                                  if (a > 24) {
                                                    if (a > 25) {
                                                      if (a > 26) {
                                                        return 26;
                                                      }
                                                      return 25;
                                                    }
                                                    return 24;
                                                  }
                                                  return 23;
                                                }
                                                return 22;
                                              }
                                              return 21;
                                            }
                                            return 20;
                                          }
                                          return 19;
                                        }
                                        return 18;
                                      }
                                      return 17;
                                    }
                                    return 16;
                                  }
                                  return 15;
                                }
                                return 14;
                              }
                              return 13;
                            }
                            return 12;
                          }
                          return 11;
                        }
                        return 10;
                      }
                      return 9;
                    }
                    return 8;
                  }
                  return 7;
                }
                return 6;
              }
              return 5;
            }
            return 4;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }

  public int tooComplex(int a, int b, int c) {
    if (a > 1) {
      if (a > 2) {
        if (a > 3) {
          if (a > 4) {
            if (a > 5) {
              if (a > 6) {
                if (a > 7) {
                  if (a > 8) {
                    if (a > 9) {
                      if (a > 10) {
                        if (a > 11) {
                          if (a > 12) {
                            if (a > 13) {
                              if (a > 14) {
                                if (a > 15) {
                                  if (a > 16) {
                                    if (a > 17) {
                                      if (a > 18) {
                                        if (a > 19) {
                                          if (a > 20) {
                                            if (a > 21) {
                                              if (a > 22) {
                                                if (a > 23) {
                                                  if (a > 24) {
                                                    if (a > 25) {
                                                      if (a > 26) {
                                                        return 26;
                                                      }
                                                      return 25;
                                                    }
                                                    return 24;
                                                  }
                                                  return 23;
                                                }
                                                return 22;
                                              }
                                              return 21;
                                            }
                                            return 20;
                                          }
                                          return 19;
                                        }
                                        return 18;
                                      }
                                      return 17;
                                    }
                                    return 16;
                                  }
                                  return 15;
                                }
                                return 14;
                              }
                              return 13;
                            }
                            return 12;
                          }
                          return 11;
                        }
                        return 10;
                      }
                      return 9;
                    }
                    return 8;
                  }
                  return 7;
                }
                return 6;
              }
              return 5;
            }
            return 4;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }

  /**
   * Serializes to the format "name=value;name=value".
   *
   * @return String with the above format.
   */
  public String serialize() {
    StringBuilder sb = new StringBuilder();
    boolean first = true;
    for (String key : options.keySet()) {
      if (first) {
        first = false;
      } else {
        sb.append(';');
      }
      sb.append(key).append('=').append(options.get(key));
    }
    return sb.toString();
  }

  /**
   * Sets the name of the profile, which must exist in the -profilesLocation directory, to use for
   * this browser session.
   *
   * @param profile the name of the profile.
   * @return this BrowserConfigurationOptions object.
   */
  public BrowserConfigurationOptions setProfile(String profile) {
    put(PROFILE_NAME, profile);
    return this;
  }

  protected String getProfile() {
    return options.get(PROFILE_NAME);
  }


  /**
   * Returns true if the {@code SINGLE_WINDOW} field is set.
   *
   * @return true if {@code SINGLE_WINDOW} is set.
   */
  protected boolean isSingleWindow() {
    if (isSet(SINGLE_WINDOW)) {
      return true;
    }
    return false;
  }

  /**
   * Returns true if the {@code MULTI_WINDOW} field is set.
   *
   * @return true if {@code MULTI_WINDOW} is set.
   */
  protected boolean isMultiWindow() {
    if (isSet(MULTI_WINDOW)) {
      return true;
    }
    return false;
  }

  /**
   * Sets {@code SINGLE_WINDOW} and unsets {@code MULTI_WINDOW}.
   *
   * @return this / self
   */
  public BrowserConfigurationOptions setSingleWindow() {
    synchronized (options) {
      options.put(SINGLE_WINDOW, "true"); // "true" string used for serialization
      options.remove(MULTI_WINDOW);
    }
    return this;
  }

  /**
   * Sets {@code MULTI_WINDOW} and unsets {@code SINGLE_WINDOW}
   *
   * @return this / self
   */
  public BrowserConfigurationOptions setMultiWindow() {
    synchronized (options) {
      options.put(MULTI_WINDOW, "true"); // "true" string used for serialization
      options.remove(SINGLE_WINDOW);
    }
    return this;
  }

  protected String getBrowserExecutablePath() {
    return options.get(BROWSER_EXECUTABLE_PATH);
  }


  /**
   * Sets the full path for the browser executable.
   *
   * @param executablePath the full path for the browser executable.
   * @return this / self
   */
  public BrowserConfigurationOptions setBrowserExecutablePath(String executablePath) {
    put(BROWSER_EXECUTABLE_PATH, executablePath);
    return this;
  }

  /**
   * Sets the timeout, in seconds, for all commands.
   *
   * @param timeout the timeout for all commands
   * @return this BrowserConfigurationOptions instance.
   */
  public BrowserConfigurationOptions setTimeoutInSeconds(int timeout) {
    put(TIMEOUT_IN_SECONDS, String.valueOf(timeout));
    return this;
  }

  protected int getTimeoutInSeconds() {
    String value = options.get(TIMEOUT_IN_SECONDS);
    if (value == null) return DEFAULT_TIMEOUT_IN_SECONDS;
    return Integer.parseInt(value);
  }

  /**
   * Sets the "mode" for the browser.
   *
   * Historically, the 'browser' argument for getNewBrowserSession implied the mode for the browser.
   * For example, *iehta indicated HTA mode for IE, whereas *iexplore indicated the default user
   * mode. Using this method allows a browser mode to be specified independently of the base
   * browser, eg. "HTA" or "PROXY".
   *
   * Note that absolutely no publication nor synchronization of these hard-coded strings such as
   * "HTA" has yet been done. Use at your own risk until this is rectified.
   *
   * @param mode - examples "HTA" or "PROXY"
   * @return this / self
   */
  public BrowserConfigurationOptions setBrowserMode(String mode) {
    put(BROWSER_MODE, mode);
    return this;
  }

  protected String getBrowserMode() {
    return options.get(BROWSER_MODE);
  }

  public BrowserConfigurationOptions setCommandLineFlags(String cmdLineFlags) {
    put(COMMAND_LINE_FLAGS, cmdLineFlags);
    return this;
  }

  public String getCommandLineFlags() {
    return get(COMMAND_LINE_FLAGS);
  }

  protected boolean canUse(String value) {
    return (value != null && !"".equals(value));
  }

  private void put(String key, String value) {
    if (canUse(value)) {
      options.put(key, value);
    }
  }

  public boolean isSet(String key) {
    boolean result = false;
    synchronized (options) {
      result = (null != options.get(key));
    }
    return result;
  }

  public String get(String key) {
    return options.get(key);
  }


  /**
   * Sets the given key to the given value unless the value is null. In that case, no entry for the
   * key is made.
   *
   * @param key the name of the key
   * @param value the value for the key
   * @return this / self
   */
  public BrowserConfigurationOptions set(String key, String value) {
    if (value != null) {
      options.put(key, value);
    }
    return this;
  }

  /**
   * @return the serialization of this object, as defined by the serialize() method.
   */
  @Override
  public String toString() {
    return serialize();
  }
}
