package org.Before;

import org.testng.annotations.Test;

public class TestPageLanch extends Newpage{
    @Test
    public void launch() {
        driver.get("https://www.google.com");
    }
}
