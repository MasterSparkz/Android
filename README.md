# Android
An android app for transmitting radio signals using 433MHz radio tranceiver.

Interface consists of 2 Radio Groups with 3 Radio Buttons within each group.

The "SEND" button is supposed to read the inputs from both radio groups before sending out a signal via an attached 433MHz transceiver.

RadioGroup radGrp1
If radio button Left selected: "L"
If radio button Both selected: "B"
If radio button Right selected: "R"

RadioGroup radGrp2
If radio button High selected: "3"
If radio button Medium selected: "2"
If radio button Low selected: "1"

A string with inputs from radGrp1 and radGrp2 are supposed to be combined once the send button is clicked.

E.g: If radio button Left and radiobutton High are selected, a string output "L3" will be send to the tranceiver using Micro-USB Cable.
