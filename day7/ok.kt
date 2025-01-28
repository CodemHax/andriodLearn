Card(
    modifier = Modifier
        .width(320.dp)
        .height(50.dp)
        .align(Alignment.CenterHorizontally),
    shape = RoundedCornerShape(30.dp)
) {
    Row(
        Modifier
            .fillMaxSize()
            .padding(start = 10.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search Icon",
            tint = Color.Black,
            modifier = Modifier
                .padding(10.dp)
                .size(28.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 10.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = "Search for hotels",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
    
