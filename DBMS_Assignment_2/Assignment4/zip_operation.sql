-- Selecting zip code, city names and states ordered by state name and city name
-- ------------------------------------------------------------------------------
select zip_code.Zip_Code , city.City_Name , states.State_Name from zip_code , city , states where zip_code.City_City_Id=city.City_Id 
and city.States_State_Id = states.State_Id order by states.State_Name , city.City_Name ;