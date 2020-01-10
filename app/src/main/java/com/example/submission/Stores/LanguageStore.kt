package com.example.submission.Stores

import com.example.submission.Models.LanguageModel
import com.example.submission.R

object LanguageStore {

    private val languagesName = arrayOf(
        "Javascript",
        "Python",
        "Java",
        "PHP",
        "C#",
        "C++",
        "Typescript",
        "Bash Shell",
        "C",
        "Ruby"
    )

    private val languagesCreator = arrayOf(
        "Brendan Eich",
        "Guido van Rossum",
        "James Gosling",
        "Rasmus Lerdorf",
        "Anders Hejlsberg",
        "Bjarne Stroustrup",
        "Anders Hejlsberg",
        "Brian Fox",
        "Dennis Ritchie",
        "Yukihiro Matsumoto"
    )

    private val languagesRelease = intArrayOf(
        1996,
        1990,
        1996,
        1994,
        2000,
        1985,
        2012,
        1989,
        1972,
        1995
    )

    private val languagesDetail = arrayOf(
        "JavaScript (/ˈdʒɑːvəˌskrɪpt/), often abbreviated as JS, is a high-level, just-in-time compiled, multi-paradigm programming language that conforms to the ECMAScript specification. JavaScript has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions.\n" +
                "\n" +
                "Alongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web. JavaScript enables interactive web pages and is an essential part of web applications. The vast majority of websites use it, and major web browsers have a dedicated JavaScript engine to execute it.\n" +
                "\n" +
                "As a multi-paradigm language, JavaScript supports event-driven, functional, and imperative (including object-oriented and prototype-based) programming styles. It has APIs for working with text, arrays, dates, regular expressions, and the DOM, but the language itself does not include any I/O, such as networking, storage, or graphics facilities. It relies upon the host environment in which it is embedded to provide these features.\n" +
                "\n" +
                "Initially only implemented client-side in web browsers, JavaScript engines are now embedded in many other types of host software, including server-side in web servers and databases, and in non-web programs such as word processors and PDF software, and in runtime environments that make JavaScript available for writing mobile and desktop applications, including desktop widgets.\n" +
                "\n" +
                "The terms Vanilla JavaScript and Vanilla JS refer to JavaScript not extended by any frameworks or additional libraries. Scripts written in Vanilla JS are plain JavaScript code.\n" +
                "\n" +
                "Although there are similarities between JavaScript and Java, including language name, syntax, and respective standard libraries, the two languages are distinct and differ greatly in design. JavaScript was influenced by programming languages such as Self and Scheme. The JSON serialization format, used to store data structures in files or transmit them across networks, is based on JavaScript.",
        "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.\n" +
                "\n" +
                "Python was conceived in the late 1980s as a successor to the ABC language. Python 2.0, released in 2000, introduced features like list comprehensions and a garbage collection system capable of collecting reference cycles. Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible, and much Python 2 code does not run unmodified on Python 3.\n" +
                "\n" +
                "The Python 2 language, i.e. Python 2.7.x, was officially discontinued on January 1, 2020 (first planned for 2015) after which security patches and other improvements will not be released for it. With Python 2's end-of-life, only Python 3.5.x and later are supported.\n" +
                "\n" +
                "Python interpreters are available for many operating systems. A global community of programmers develops and maintains CPython, an open source reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.",
        "Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems, which was later acquired by the Oracle Corporation, that provides a system for developing application software and deploying it in a cross-platform computing environment. Java is used in a wide variety of computing platforms from embedded devices and mobile phones to enterprise servers and supercomputers. Java applets, which are less common than standalone Java applications, were commonly run in secure, sandboxed environments to provide many features of native applications through being embedded in HTML pages.\n" +
                "\n" +
                "Writing in the Java programming language is the primary way to produce code that will be deployed as byte code in a Java virtual machine (JVM); byte code compilers are also available for other languages, including Ada, JavaScript, Python, and Ruby. In addition, several languages have been designed to run natively on the JVM, including Clojure, Groovy, and Scala. Java syntax borrows heavily from C and C++, but object-oriented features are modeled after Smalltalk and Objective-C. Java eschews certain low-level constructs such as pointers and has a very simple memory model where objects are allocated on the heap (while some implementations e.g. all currently supported by Oracle, may use escape analysis optimization to allocating on the stack instead) and all variables of object types are references. Memory management is handled through integrated automatic garbage collection performed by the JVM.\n" +
                "\n" +
                "On November 13, 2006, Sun Microsystems made the bulk of its implementation of Java available under the GNU General Public License (GPL).\n" +
                "\n" +
                "The latest versions are Java 13, released in October 2019, and Java 11, a currently supported long-term support (LTS) version (\"Oracle Customers will receive Oracle Premier Support\"), released on September 25, 2018; Oracle released for the \"legacy\" Java 8 LTS the last free \"public update\" in January 2019 for commercial use, while it will otherwise still support Java 8 with public updates for personal use up to at least December 2020. Oracle (and others) \"highly recommend that you uninstall older versions of Java\", because of serious risks due to unresolved security issues. Since Java 9 (and 10) is no longer supported, Oracle advises its users to \"immediately transition\" to Java 11 (Java 12 is also an non-LTS option). Oracle released the last public update for the legacy Java 8 LTS, which is free for commercial use, in January 2019. Java 8 will be supported with public updates for personal use up to at least December 2020. Oracle extended support for Java 6 ended in December 2018.",
        "PHP is a general-purpose programming language originally designed for web development. It was originally created by Rasmus Lerdorf in 1994; the PHP reference implementation is now produced by The PHP Group. PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor.\n" +
                "\n" +
                "PHP code may be executed with a command line interface (CLI), embedded into HTML code, or used in combination with various web template systems, web content management systems, and web frameworks. PHP code is usually processed by a PHP interpreter implemented as a module in a web server or as a Common Gateway Interface (CGI) executable. The web server outputs the results of the interpreted and executed PHP code, which may be any type of data, such as generated HTML code or binary image data. PHP can be used for many programming tasks outside of the web context, such as standalone graphical applications and robotic drone control.\n" +
                "\n" +
                "The standard PHP interpreter, powered by the Zend Engine, is free software released under the PHP License. PHP has been widely ported and can be deployed on most web servers on almost every operating system and platform, free of charge.\n" +
                "\n" +
                "The PHP language evolved without a written formal specification or standard until 2014, with the original implementation acting as the de facto standard which other implementations aimed to follow. Since 2014, work has gone on to create a formal PHP specification.\n" +
                "\n" +
                "As of September 2019, over 60% of sites on the web using PHP are still on discontinued/\"EOLed\" version 5.6 or older; versions prior to 7.2 are no longer officially supported by The PHP Development Team, but security support is provided by third parties, such as Debian.",
        "C# (pronounced see sharp, like the musical note C♯, but written with the number sign) is a general-purpose, multi-paradigm programming language encompassing strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.It was developed around 2000 by Microsoft as part of its .NET initiative, and later approved as an international standard by Ecma (ECMA-334) and ISO (ISO/IEC 23270:2018). Mono is the name of the free and open-source project to develop a compiler and runtime for the language. C# is one of the programming languages designed for the Common Language Infrastructure (CLI).\n" +
                "\n" +
                "C# was designed by Anders Hejlsberg, and its development team is currently led by Mads Torgersen. The most recent version is 8.0, which was released in 2019 alongside Visual Studio 2019 version 16.3.",
        "C++ (/ˌsiːˌplʌsˈplʌs/) is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\". The language has expanded significantly over time, and modern C++ has object-oriented, generic, and functional features in addition to facilities for low-level memory manipulation. It is almost always implemented as a compiled language, and many vendors provide C++ compilers, including the Free Software Foundation, LLVM, Microsoft, Intel, Oracle, and IBM, so it is available on many platforms.\n" +
                "\n" +
                "C++ was designed with a bias toward system programming and embedded, resource-constrained software and large systems, with performance, efficiency¸ and flexibility of use as its design highlights. C++ has also been found useful in many other contexts, with key strengths being software infrastructure and resource-constrained applications, including desktop applications, servers (e.g. e-commerce, Web search, or SQL servers), and performance-critical applications (e.g. telephone switches or space probes).\n" +
                "\n" +
                "C++ is standardized by the International Organization for Standardization (ISO), with the latest standard version ratified and published by ISO in December 2017 as ISO/IEC 14882:2017 (informally known as C++17). The C++ programming language was initially standardized in 1998 as ISO/IEC 14882:1998, which was then amended by the C++03, C++11 and C++14 standards. The current C++17 standard supersedes these with new features and an enlarged standard library. Before the initial standardization in 1998, C++ was developed by Danish computer scientist Bjarne Stroustrup at Bell Labs since 1979 as an extension of the C language; he wanted an efficient and flexible language similar to C that also provided high-level features for program organization. C++20 is the next planned standard, keeping with the current trend of a new version every three years.",
        "TypeScript is an open-source programming language developed and maintained by Microsoft. It is a strict syntactical superset of JavaScript, and adds optional static typing to the language.\n" +
                "\n" +
                "TypeScript is designed for development of large applications and transcompiles to JavaScript. As TypeScript is a superset of JavaScript, existing JavaScript programs are also valid TypeScript programs. TypeScript may be used to develop JavaScript applications for both client-side and server-side execution (as with Node.js or Deno).\n" +
                "\n" +
                "There are multiple options available for transcompilation. Either the default TypeScript Checker can be used, or the Babel compiler can be invoked to convert TypeScript to JavaScript.\n" +
                "\n" +
                "TypeScript supports definition files that can contain type information of existing JavaScript libraries, much like C++ header files can describe the structure of existing object files. This enables other programs to use the values defined in the files as if they were statically typed TypeScript entities. There are third-party header files for popular libraries such as jQuery, MongoDB, and D3.js. TypeScript headers for the Node.js basic modules are also available, allowing development of Node.js programs within TypeScript.\n" +
                "\n" +
                "The TypeScript compiler is itself written in TypeScript and compiled to JavaScript. It is licensed under the Apache License 2.0.\n" +
                "\n" +
                "TypeScript is included as a first-class programming language in Microsoft Visual Studio 2013 Update 2 and later, beside C# and other Microsoft languages. An official extension allows Visual Studio 2012 to support TypeScript as well.\n" +
                "\n" +
                "Anders Hejlsberg, lead architect of C# and creator of Delphi and Turbo Pascal, has worked on the development of TypeScript.",
        "GNU Bash or simply Bash is a Unix shell and command language written by Brian Fox for the GNU Project as a free software replacement for the Bourne shell. First released in 1989, it has been used widely as the default login shell for most Linux distributions and Apple's macOS Mojave and earlier versions. A version is also available for Windows 10. It is also the default user shell in Solaris 11.\n" +
                "\n" +
                "Bash is a command processor that typically runs in a text window where the user types commands that cause actions. Bash can also read and execute commands from a file, called a shell script. Like all Unix shells, it supports filename globbing (wildcard matching), piping, here documents, command substitution, variables, and control structures for condition-testing and iteration. The keywords, syntax, dynamically scoped variables and other basic features of the language are all copied from sh. Other features, e.g., history, are copied from csh and ksh. Bash is a POSIX-compliant shell, but with a number of extensions.\n" +
                "\n" +
                "The shell's name is an acronym for Bourne-again shell, a pun on the name of the Bourne shell that it replaces and the notion of being \"born again\".\n" +
                "\n" +
                "A security hole in Bash dating from version 1.03 (August 1989), dubbed Shellshock, was discovered in early September 2014 and quickly led to a range of attacks across the Internet. Patches to fix the bugs were made available soon after the bugs were identified.",
        "C (/siː/, as in the letter c) is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, while a static type system prevents unintended operations. By design, C provides constructs that map efficiently to typical machine instructions and has found lasting use in applications previously coded in assembly language. Such applications include operating systems and various application software for computers, from supercomputers to embedded systems.\n" +
                "\n" +
                "C was originally developed at Bell Labs by Dennis Ritchie between 1972 and 1973 to make utilities running on Unix. Later, it was applied to re-implementing the kernel of the Unix operating system. During the 1980s, C gradually gained popularity. It has become one of the most widely used programming languages, with C compilers from various vendors available for the majority of existing computer architectures and operating systems. C has been standardized by the ANSI since 1989 (see ANSI C) and by the International Organization for Standardization.\n" +
                "\n" +
                "C is an imperative procedural language. It was designed to be compiled using a relatively straightforward compiler to provide low-level access to memory and language constructs that map efficiently to machine instructions, all with minimal runtime support. Despite its low-level capabilities, the language was designed to encourage cross-platform programming. A standards-compliant C program written with portability in mind can be compiled for a wide variety of computer platforms and operating systems with few changes to its source code. The language is available on various platforms, from embedded microcontrollers to supercomputers.",
        "Ruby is an interpreted, high-level, general-purpose programming language. It was designed and developed in the mid-1990s by Yukihiro \"Matz\" Matsumoto in Japan.\n" +
                "\n" +
                "Ruby is dynamically typed and uses garbage collection. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. According to the creator, Ruby was influenced by Perl, Smalltalk, Eiffel, Ada, Basic, and Lisp."
    )

    private val languagesLogo = intArrayOf(
        R.drawable.ic_javascript,
        R.drawable.ic_python,
        R.drawable.ic_java,
        R.drawable.ic_php,
        R.drawable.ic_csharp,
        R.drawable.ic_cpp,
        R.drawable.ic_typescript,
        R.drawable.ic_bash,
        R.drawable.ic_c,
        R.drawable.ic_ruby
    )

    val languages: ArrayList<LanguageModel>
        get() {
            val list = arrayListOf<LanguageModel>()
            for (position in languagesName.indices) {
                val language = LanguageModel()
                language.name = languagesName[position]
                language.detail = languagesDetail[position]
                language.creator = languagesCreator[position]
                language.release = languagesRelease[position]
                language.logo = languagesLogo[position]
                list.add(language)
            }
            return list
        }
}