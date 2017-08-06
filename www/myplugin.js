var myplugin = {
	execute: function(sAction, aParam, cbSuccess, cbError) {
		cordova.exec(cbSuccess, cbError, "MyPlugin", sAction, aParam);
	}
};

module.exports = myplugin;
