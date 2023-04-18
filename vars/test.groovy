
def call(){
	def appName = "Test"
	def deploy = "T1"
	def techno = "Another Test"
	echo "New Logic"
	def loadProp = libraryResource "scriptfile.sh"
	writeFile file: "scriptfile.sh", text: loadProp
	sh "./scriptfile.sh ${appName} ${deploy} ${techno} ranganath"
}
