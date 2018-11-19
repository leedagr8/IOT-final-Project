<?php

//This class will contain all of my operations for the DB
	
	//echo'balah';

	class DbOperations_Pow{

		private $con;

		function __construct(){

			require_once dirname(__FILE__).'/DbConnect.php';

			$db = new DbConnect();

			$this->con = $db->connect();

		}

		/*CRUD -> C -> Create */

		public function createUser($username, $pass, $name, $email, $phone){

			$password = md5($pass); //encryptes your password to hash5 :)
			//$password = $pass;
			//Prepares a query for you.
			$stmt = $this->con->prepare("INSERT INTO `users_pow` (`id`, `username`, `password`, `name`, `email`, `phone`) VALUES (NULL,?,?,?,?,?);"); 

			//bind parameters to your query

			$stmt->bind_param("sssss", $username, $password, $name, $email, $phone);

			//check to make sure there's no error in inserting this row into database.
			if($stmt->execute()){
				return true;
			}else{
				return false;
			}
		}
		
	

	 public function userLogin($username, $pass){
		
		$password = md5($pass);
		$stmt = $this->con->prepare("SELECT id FROM users_pow WHERE username = ? AND password = ?			");
		$stmt->bind_param("ss",$username,$password);
		$stmt->execute();
		$stmt->store_result();
		return $stmt->num_rows > 0;
	}

	 public function getUserByUsername($username){
		$stmt = $this->con->prepare("SELECT * FROM users_pow WHERE username = ?");
		$stmt->bind_param("s",$username);
		$stmt->execute();
		return $stmt->get_result()->fetch_assoc();




	}

	}
?>
