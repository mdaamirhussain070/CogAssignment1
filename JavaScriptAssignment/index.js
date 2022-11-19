

    function result(){
        let fullName=document.getElementById("fulname").value;
       localStorage.setItem("fulname",fullName);

        let dateOfBirth=document.getElementById("dateOfBirth").value;
        localStorage.setItem("dob",dateOfBirth);

        let emailgiven=document.getElementById("email").value;
        localStorage.setItem("email",emailgiven);
    
        let mobileNumber1=document.getElementById("mobileNumber").value;
        localStorage.setItem("mobile",mobileNumber1);
      
        let gender=document.getElementById("gender").value;
        localStorage.setItem("gender",gender);
       
        let occupation=document.getElementById("occupation").value;
        localStorage.setItem("occupation",occupation);
   
        let idType=document.getElementById("idtype").value;
        localStorage.setItem("idType",idType);
     
        let idnumber=document.getElementById("idnumber").value;
        localStorage.setItem("idnumber",idnumber);
       
        let issueauthority=document.getElementById("issueauthority").value;
        localStorage.setItem("issueauthority",issueauthority);
        
        let issuedate=document.getElementById("issuedate").value;
        localStorage.setItem("issuedate",issuedate);
     
        let issueState=document.getElementById("issueState").value;
        localStorage.setItem("issueState",issueState);
       
        let expirydate=document.getElementById("expirydate").value;
        localStorage.setItem("expirydate",expirydate);

         console.log(fullName);
        console.log(dateOfBirth);
        console.log(emailgiven);
        console.log(mobileNumber1);
        console.log(gender);
        console.log(occupation);
        console.log(idType);
        console.log(idnumber);
        console.log(issueauthority);
        console.log(issuedate);
        console.log(issueState);
        console.log(expirydate);
}
    function reloadData(){
        let name=localStorage.getItem("fulname")
        document.getElementById("name").innerText=name;
      
        let dob=localStorage.getItem("dob")
        document.getElementById("dob").innerText=dob;
     
        let emailset=localStorage.getItem("email")
        document.getElementById("email").innerText=emailset;
       
        let mobileset=localStorage.getItem("mobile")
        document.getElementById("mobile").innerText=mobileset;
       
        let gender=localStorage.getItem("gender")
        document.getElementById("gender").innerText=gender;
       
        let occupation=localStorage.getItem("occupation")
        document.getElementById("occupation").innerText=occupation;
        
        let idTypeset=localStorage.getItem("idType")
        document.getElementById("idtype").innerText=idTypeset;
       
        let idnumber=localStorage.getItem("idnumber")
        document.getElementById("idnumber").innerText=idnumber;
       
        let issueauthority=localStorage.getItem("issueauthority")
        document.getElementById("issueauthority").innerText=issueauthority;
        
        let issuedate=localStorage.getItem("issuedate")
        document.getElementById("issuedate").innerText=issuedate;
       
        let issueState=localStorage.getItem("issueState")
        document.getElementById("issueState").innerText=issueState;
      
        let expirydate=localStorage.getItem("expirydate")
        document.getElementById("expiry").innerText=expirydate;
       
    }

    function enablediable(){
       
        let input = document.querySelector("#fulname");
        let button = document.querySelector("#btn");
        
        button.disabled = true; 
        
        input.addEventListener("change", stateHandle);
        
        function stateHandle() {
            if (document.querySelector("#fulname").value === "") {
                button.disabled = true; 
            } else {
                button.disabled = false; 
            }
        }
    }
    function focused(){
        
    }
   

   function clearform(){
    document.myform.reset();
   } 