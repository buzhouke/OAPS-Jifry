<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<nav>
		<ul>
			<li><a href="Controller?page=home">Home</a></li>
			<li><a href="Controller?page=contact">Contact us for help</a></li>
			<li><a href="Controller?page=admin">Author</a></li>
		</ul>

		<form action="/OOAD/Controller" method="post">
			<input type="hidden" name="page" value="select"> <select
				name="option">
				<option value="Articles">Articles</option>
			</select>
			<button>go</button>
		</form>

		<form action="/OOAD/Controller" method="post">
			<input type="hidden" name="page" value="search"> <input
				type="text" name="search2" required>
			<button>search</button>
		</form>
	</nav>
</header>