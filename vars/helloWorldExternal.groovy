def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./helloWorld.sh ${config.name} ${config.dayOfWeek}"
}