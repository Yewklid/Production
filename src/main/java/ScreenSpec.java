/*---------------------------------------------------------
file: ScreenSpec.java
  by: Joseph Morelli
 org: COP 3003, Fall 2020
 for: Controller for all tab pages; Applies their
      functionality.
---------------------------------------------------------*/

public interface ScreenSpec {

  /**
   * Gets screen's resolution
   *
   * @return resolution
   */

  @SuppressWarnings("unused")
  String getResolution();

  /**
   * Gets screen's refresh rate
   *
   * @return refresh rate
   */

  @SuppressWarnings("unused")
  int getRefreshRate();

  /**
   * Gets screen's response time
   *
   * @return response time
   */

  @SuppressWarnings("unused")
  int getResponseTime();
}
