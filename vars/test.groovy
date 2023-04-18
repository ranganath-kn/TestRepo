
def call(){
	def appName = "Test"
	def deploy = "T1"
	def techno = "Another Test"
	echo "New Logic"
	sh """
	cat >> ./${appName}-prop.file <<EOF
	name=${appName}
	operation=${deploy}
	tech=${techno}
	trigger=${BUILD_USER_ID}
	"""
}
