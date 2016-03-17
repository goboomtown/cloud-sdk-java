# cloud-sdk-java: Boomtown Provider API (Java)
Java SDK for the Boomtown Cloud API.

## Overview
Boomtown provides a Cloud API SDK to support providers needing code access to our data layer.

Authentication is used using a pre-shared key and secret, which is generated in our Admin Portal.

## Getting Started
To get started:
 - Clone this repository
 - Import as a Gradle project to your IDE
 - Generate API keys from the Boomtown Admin Portal
 - Configure the API keys in `Constants`
 - Review examples in `ApiExample`

## API Key Generation
To generate an API access token and private-key:
 - Log onto the Admin Portal (https://admin.goboomtown.com)
 - Click Providers in the left menu
 - Find your provider in the list
 - Double click your provider
 - Click API Settings, near the button of the configuration panel
 - Select Sandbox or Live, depending on the state of development
 - Click Re-Generate
 - Copy the access token and private-key, as provided in the pop-up dialog

## Java SDK Configuration
Prior to using the API, you must configure the Java sources with the generated access token and private-key:
 - Follow the *Getting Started* section, for importing the project into your IDE
 - Set `Constants.TOKEN` equal to the access token generated in the Admin Portal.
 - Set `Constants.KEY` equal to the private-key generated in the Admin Portal.

## Examples
See `ApiExample` for examples interfacing with the API.

### ApiExample.main(String[])
By default, running `ApiExample.main(String[])` will dump/output the provider's information, including it's associated merchants.

### api.exampleGetProvider()
Dumps/outputs the provider's information, including it's associated merchants.

### api.exampleGetIssues()
By default, dumps the 5 most recent issues associated to the provider.

### api.exampleAddIssueNotes()
Adds a single note to the provider's most recent issue.

### api.exampleResolveIssue()
Sets the status of the provider's most recent issue to resolved.

### api.exampleCreateMerchant()
Creates a new merchant, location and user, and associates the new member the provider.
