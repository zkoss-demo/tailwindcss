# Overview
This is a simple project to demonstrate how to use [tailwindcss](https://tailwindcss.com/) with ZK framework.

# How to run
`mvn jetty:run`

# Installation
Just follow [the steps with Tailwind CLI](https://tailwindcss.com/docs/installation)
1. Install Tailwind CSS <br/>
`npm install -D tailwindcss` <br/>
`npx tailwindcss init`
2. configure `zul` into template paths in `tailwind.config.js`
3. Add the Tailwind directives to your CSS
4. Start the Tailwind CLI build process <br/>
`npx tailwindcss -i ./src/input.css -o ./src/output.css --watch`
5. Start using Tailwind in your zul

# Details
after start the build process, it monitors all zul for CSS class you use and keep producing the output.css file based on the classes you use.