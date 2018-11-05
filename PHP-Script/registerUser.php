
<?php
//Will contain the webservices that will be called from android


//Store data into database
require_once dirname(__FILE__).'/DbOperations.php';
$response = array();

//check if there's a post method or not
ini_set('display_errors', 1);
if($_SERVER['REQUEST_METHOD']=='POST'){
	if(
		isset($_POST['username']) and 
			isset($_POST['password']) and
				isset($_POST['name']) and
					isset($_POST['email']) and
						isset($_POST['phone'])
		){
		//if all keys are set then user has provided all the values needed. Can operate the data


		$db = new DbOperations();

		if($db->createUser(
			$_POST['username'],
			$_POST['password'],
			$_POST['name'],
			$_POST['email'],
			$_POST['phone']
		)){
			$response['error'] = false;
			$response['message'] = "User registered successfully";
		}else{
			$response['error'] = true;
			$response['messsage'] = "Error occured please retry.";
		}

	}else{
		$response['error'] = true;
		$response['message'] ="Required fields are missing";
	}

}else{
	$response['error'] = true;
	$response['message'] = "Invalid Request";
}

//This will automatically encode this array into JSON object and display it in the browser.
echo json_encode($response);
?>

