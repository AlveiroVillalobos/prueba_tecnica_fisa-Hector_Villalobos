package com.test.steps;

import com.test.pageobjects.VirtualPianoPage;
import com.test.utils.Constants;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VirtualPianoSteps extends UIInteractionSteps {

    VirtualPianoPage virtualPianoPage;

    @Step("User opens the virtual piano APP")
    public void openVirtualPianoPage() {
        virtualPianoPage.open();
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(presenceOfElementLocated(VirtualPianoPage.VIRTUALPIANO_LABEL));
    }

    @Step("User plays the first sequence")
    public void playFirstSequence() {
        try {
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("User plays the second sequence")
    public void playSecondSequence() {
        try {
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(750);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(1000);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(1000);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);

            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.F3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D2_NOTE).perform();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("User plays the second sequence corrected")
    public void playSecondSequenceCorrected() {
        try {
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(750);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(1000);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(1000);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.C3_NOTE).perform();
            Thread.sleep(250);
            virtualPianoPage.withAction().sendKeys(Constants.B3_NOTE).perform();
            Thread.sleep(500);

            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.G2_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.A3_NOTE).perform();
            Thread.sleep(500);
            virtualPianoPage.withAction().sendKeys(Constants.D2_NOTE).perform();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void playVirtualPianoWithClick() {
        find(VirtualPianoPage.B3NOTE_KEY).click();
    }
}
