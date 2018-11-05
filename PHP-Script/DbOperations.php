<?php

//This class will contain all of my operations for the DB
	
	//echo'balah';

	class DbOperations{

		private $con;

		function __construct(){

			require_once dirname(__FILE__).'/DbConnect.php';

			$db = new DbConnect();

			$this->con = $db->connect();

		}

		/*CRUD -> C -> Create */

		function createUser($username, $pass, $name, $email, $phone){

			$password = md5($pass); //encryptes your password to hash5 :)

			//Prepares a query for you.
			$stmt = $this->con->prepare("INSERT INTO `users` (`id`, `username`, `password`, `name`, `email`, `phone`) VALUES (NULL,?,?,?,?,?);"); 

			//bind parameters to your query

			$stmt->bind_param("sssss", $username, $password, $name, $email, $phone);

			//check to make sure there's no error in inserting this row into database.
			if($stmt->execute()){
				return true;
			}else{
				return false;
			}
		}
	}
?>