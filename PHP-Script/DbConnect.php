
<?php
	
	//This script will connect to the database and return a link to the database;

	//echo'haie';
	class DbConnect{

		
		private $con;

		function __construct(){


		}

		function connect(){
			//Need to include my Constants files 
			Require_once dirname(__FILE__).'/Constants.php';

			//initialize connector DB
			$this->con = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);

			//check for errors
			if(mysqli_connect_errno()){
				echo "Failed to connect with database".mysqli_connect_err();
			}

			return $this->con;
		}
	}

?>
