#!/usr/bin/env bash

# install fastlane
bundle install --path vendor/bundle
gem install fastlane

# install globally
npm install -g conventional-github-releaser

# install node package available on package.json
npm install

# install transifex CLI
python3 -m venv venv
. venv/bin/activate
pip install transifex-client
sudo echo $'[https://www.transifex.com]\nhostname = https://www.transifex.com\nusername = '"$TRANSIFEX_USER"$'\npassword = '"$TRANSIFEX_API_TOKEN"$'\ntoken = '"$TRANSIFEX_API_TOKEN"$'\n' > ~/.transifexrc