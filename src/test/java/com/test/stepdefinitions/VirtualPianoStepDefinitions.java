package com.test.stepdefinitions;

import com.test.steps.VirtualPianoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class VirtualPianoStepDefinitions {

    @Steps
    VirtualPianoSteps virualPianoSteps;

    @Given("User navigates to the virtual piano app")
    public void openVirtualPianoPage(){
        virualPianoSteps.openVirtualPianoPage();
    }

    @When("User plays the first sequence on virtual piano")
    public void playFirstSequence() throws InterruptedException {
        System.out.println("Play piano");
        Thread.sleep(5000);
        virualPianoSteps.playFirstSequence();
    }

    @When("User plays the first sequence twice on virtual piano")
    public void playFirstSequenceTwice() throws InterruptedException {
        System.out.println("Play piano");
        Thread.sleep(5000);
        virualPianoSteps.playFirstSequence();
        virualPianoSteps.playFirstSequence();
    }

    @When("User plays the second and first sequence on virtual piano")
    public void playFirstAndSecondSequence() throws InterruptedException {
        System.out.println("Play piano");
        Thread.sleep(5000);
        virualPianoSteps.playSecondSequence();
        virualPianoSteps.playFirstSequence();
    }

    @When("User plays the second and first sequence corrected on virtual piano")
    public void playFirstAndSecondSequenceCorrected() throws InterruptedException {
        System.out.println("Play piano");
        Thread.sleep(5000);
        virualPianoSteps.playSecondSequenceCorrected();
        virualPianoSteps.playFirstSequence();
    }

    @When("User plays on virtual piano")
    public void playVirtualPiano() throws InterruptedException {
        System.out.println("Play piano");
        virualPianoSteps.playVirtualPianoWithClick();
    }

    @Then("User listens to the melody")
    public void listenToTheMelody() {
        System.out.println("User listens to the melody");
    }
}
