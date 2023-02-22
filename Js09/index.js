const parrotSay = require('parrotsay-api')
 
parrotSay('meh')
  .then(console.log)
  .catch(console.error)