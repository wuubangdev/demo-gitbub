<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dat Mua May Tinh</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<%
		String processor = request.getParameter("processor");
		String ram = request.getParameter("ram");
		String monitor = request.getParameter("monitor");
		String[] accessories = request.getParameterValues("accessories");
		
		double totalPrice = 0;
		double processorPrice = 0;
		double ramPrice = 0;
		double monitorPrice = 0;
		double accessoriesPrice = 0;
		
		if (processor!=null) {
			if(processor.equals("corei9")) {
				processorPrice += 200;
			} else if(processor.equals("corei7")) {
				processorPrice += 150;
			} else if(processor.equals("corei5")) {
				processorPrice += 100;
			} else if(processor.equals("corei3")) {
				processorPrice += 50;
			}
		}
		
		if (ram!=null) {
			if(ram.equals("8G")) {
				ramPrice += 15;
			} else if(ram.equals("16G")) {
				ramPrice += 30;
			} else if(ram.equals("32G")) {
				ramPrice += 45;
			}
		}
		
		if (monitor!=null) {
			if(monitor.equals("24i")) {
				monitorPrice += 120;
			} else if(monitor.equals("27i")) {
				monitorPrice += 180;
			} else if(monitor.equals("32i")) {
				monitorPrice += 240;
			}
		}
		
		if(accessories!=null) {
			for (String chooses: accessories) {
				if(chooses.equals("Camera")) {
					accessoriesPrice += 80; 
				}
				if(chooses.equals("Printer")) {
					accessoriesPrice += 250; 
				}
				if(chooses.equals("Scanner")) {
					accessoriesPrice += 180; 
				}
				if(chooses.equals("Speaker")) {
					accessoriesPrice += 45; 
				}
			}
		}
		totalPrice = accessoriesPrice + monitorPrice +ramPrice + processorPrice;
	%>
	
	<div class="container" style="width: 720px">
	<h1>Hóa đơn</h1>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Tên sản phẩm</th>
		      <th scope="col">Giá tiền</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<%if(processor!=null){ %>
			    <tr>
			      <td><%=processor %></td>
			      <td><%=processorPrice%>$</td>
			    </tr>
		    <%} %>
		  	<%if(ram!=null){ %>
			    <tr>
			      <td><%=ram %></td>
			      <td><%=ramPrice%>$</td>
			    </tr>
		    <%} %>
		  	<%if(monitor!=null){ %>
			    <tr>
			      <td><%=monitor %></td>
			      <td><%=monitorPrice%>$</td>
			    </tr>
		    <%} %>
		  	<%if(accessories!=null){ 
		  	 	for(String chooses: accessories) {
		  	 		double price = 0;
		  	 		if(chooses.equals("Camera")) {
		  	 			price = 80; 
					}
					if(chooses.equals("Printer")) {
						price = 250; 
					}
					if(chooses.equals("Scanner")) {
						price = 180; 
					}
					if(chooses.equals("Speaker")) {
						price = 45; 
					}
		  	 	%>
				    <tr>
				      <td><%=chooses %></td>
				      <td><%=price%>$</td>
				    </tr>
		    <%	} 
		  	 }%>
		    	<tr>
			      <td>Tổng sản phẩm</td>
			      <td>
					<b><%=totalPrice%>$</b>				      	
			      </td>
			    </tr>
		  </tbody>
		</table>
	</div>
</body>
</html>