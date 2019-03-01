# RemoteDebug/RemoteDebugger Library for Arduino - source converter
An converter to add debugger codes (RemoteDebugger)  to a Arduino projects that uses RemoteDebug library

<a href="#releases">![build badge](https://img.shields.io/badge/version-v0.1.0-blue.svg)</a> 
<a href="https://github.com/JoaoLopesF/RemoteDebugConverter/blob/master/LICENSE.txt">
![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)</a>

This Java program is a converter, to help to migrate your Arduino codes, that uses the __RemoteDebug__ library,
to add __RemoteDebugger__ codes, as initializations and add codes to debugger, as global variables references.

## Contents

- [About](#about)
- [Github](#github)
- [Beta version](#beta-version)
- [How it looks](#how-it-looks-1)
- [Usage](#usage)
- [Releases](#releases)

## About

__RemoteDebug__ is an ibrary for Arduino to debug devices over WiFi (telnet) with Print commands like Serial Monitor.

__RemoteDebugger__ is an addon to __RemoteDebug__ library.
It add to __RemoteDebug_, an simple software debugger,
to see/change global variables, to add watch for these variables,
or call a function, in runtime, using serial monitor.

* [RemoteDebug library](https://github.com/JoaoLopesF/RemoteDebug)
* [RemoteDebugger library](https://github.com/JoaoLopesF/RemoteDebugger)

This converter is to help migrate your codes to use __RemoteDebugger__ library

This program do:

- Put #include for __RemoteDebugger__ library
- Detects global variables and put in setup,
 __RemoteDebugger__ calls to add it into a their simple software debugger
- Save the source files in separate diretory, appending _Dbg in names
- Open the directory converted, into a system explorer,
  so You can open this in Arduino

## Beta version

This is a beta version. 
Not yet fully tested, optimized, and documented.

## Github

Contribute to this libray development by creating an account on GitHub.

Please give a star, if you find this library usefull, 
this help a another people, discover it too.

Please add a issue for problems or suggestion.

I suggest you use a Github Desktop New app to clone, 
it help to keep updated.


## How it looks

![Screenshot 1](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot1.png)
![Screenshot 2](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot2.png)
![Screenshot 3](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot3.png)
![Screenshot 4](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot4.png)
![Screenshot 5](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot5.png)
![Screenshot 6](https://github.com/JoaoLopesF/RemoteDebuggerConverter/blob/master/Screenshots/screenshot6.png)

## Usage

This runs in MacOsx, Linux and Windows (and other supported by Java).

You can use this converter in 2 modes:

- Java project

  If you is a Java developer:

  - Just download or clone this repository.

  - And open project a Java IDE, as Eclipse.

- Binary release (needs Java runtime)

  - You can download binary release of this converter

  Latest binary release: [Jar runnable - release v0.1.0](https://github.com/JoaoLopesF/RemoteDebuggerConverter/releases/download/v0.1.0/RemoteDebuggerConverter.jar.zip)

  - Uncompress the Zip file,
  - And run the jar file

## Releases

### 0.1.0 - 2019-02-29

    - First beta
