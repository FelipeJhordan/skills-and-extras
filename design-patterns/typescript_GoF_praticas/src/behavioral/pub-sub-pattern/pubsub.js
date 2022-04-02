const channels = () => {
    const channels = {}

    const subscribe = ( channelName, callback) => {
        const currentCbs = channels[channelName] || []
        currentCbs.push(callback)
        channels[channelName] = currentCbs
        console.log(channels)
    }

    const publish =  ( channelName, message ) => {
        if(channels[channelName]) {
            channels[channelName].forEach( fn => fn(message))
        }
    }

    const unsubscribe = (channelName, callback) => {
        const index = (channels[channelName] || []).indexOf(callback) 
        if(index >=0) {
            channels[channelName].splice(index, 1)
        }
    }

    const broadcast = message => {
        Object
        .keys(channels)
        .map(channel => publish(channel, message))
    }

    return {
        publish,
        subscribe,
        unsubscribe,
        broadcast
    }
}

const socket = channels()

socket.subscribe('futebol', message => {
    console.log('message 1', message)
})

const fn = message => console.log('message 2', message)
socket.subscribe('futebol', fn)


setInterval(() => {
    socket.publish('futebol', {
        message: 'time a e time b'
    })
}, 1000);

socket.broadcast({ message: 'broadcast'})

socket.unsubscribe('futebol', fn)