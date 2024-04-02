package com.example.learninghtmlandcss.data

import com.example.learninghtmlandcss.R

data class WebdevData
    (val dayNumber: String, //for example Day 1
     val title: String, // for example "The Building Blocks of the Web"
     val description: String, // for example "Grasp the basics of HTML"
     val imageResId: Int) // image

val webDevChallenges = listOf(
    WebdevData(
        dayNumber = "Day 1",
        title = "The Building Blocks of the Web",
        description = "Grasp the basics of HTML, the standard markup language used to create web pages.",
        imageResId = R.drawable.day1_image
    ),
    WebdevData(
        dayNumber = "Day 2",
        title = "Crafting Content with Tags",
        description = "Dive into the most common HTML tags to structure written content, like paragraphs, headings, and breaks.",
        imageResId = R.drawable.day2_image
    ),
    WebdevData(
        dayNumber = "Day 3",
        title = "Organizing Lists",
        description = "Learn to organize items using ordered (numbered) and unordered (bulleted) lists.",
        imageResId = R.drawable.day3_image
    ),
    WebdevData(
        dayNumber = "Day 4",
        title = "Navigating with Links",
        description = "Understand the concept of hyperlinks for navigating between pages within your site or to external sites.",
        imageResId = R.drawable.day4_image
    ),
    WebdevData(
        dayNumber = "Day 5",
        title = "Bringing Pages to Life with Images",
        description = "Embed images into your web pages and learn how to adjust their size and position.",
        imageResId = R.drawable.day5_image
    ),
    WebdevData(
        dayNumber = "Day 6",
        title = "Tabulating Data",
        description = "Introduce tables into your web pages to display data in a structured format.",
        imageResId = R.drawable.day6_image
    ),
    WebdevData(
        dayNumber = "Day 7",
        title = "Interacting with Forms",
        description = "Create interactive forms for user input with text fields, checkboxes, and radio buttons.",
        imageResId = R.drawable.day7_image
    ),
    WebdevData(
        dayNumber = "Day 8",
        title = "Segmenting with Divs and Spans",
        description = "Differentiate between div and span for grouping and styling inline content.",
        imageResId = R.drawable.day8_image
    ),
    WebdevData(
        dayNumber = "Day 9",
        title = "Embracing HTML5 Structure",
        description = "Adopt semantic elements like header, nav, and aside to create a meaningful structure.",
        imageResId = R.drawable.day9_image
    ),
    WebdevData(
        dayNumber = "Day 10",
        title = "Embedding Multimedia",
        description = "Incorporate audio and video for a richer user experience.",
        imageResId = R.drawable.day10_image
    ),
    WebdevData(
        dayNumber = "Day 11",
        title = "Styling with Purpose: Introduction to CSS",
        description = "Discover how CSS enhances the visual design of web pages.",
        imageResId = R.drawable.day11_image
    ),
    WebdevData(
        dayNumber = "Day 12",
        title = "Selectors and Declarations: The CSS Syntax",
        description = "Understand how to target HTML elements and apply styles using CSS.",
        imageResId = R.drawable.day12_image
    ),
    WebdevData(
        dayNumber = "Day 13",
        title = "Understanding the CSS Box Model",
        description = "Master the box model to control spacing and borders around elements.",
        imageResId = R.drawable.day13_image
    ),
    WebdevData(
        dayNumber = "Day 14",
        title = "Fonts and Text Styling",
        description = "Choose fonts and style text to improve readability and aesthetic appeal.",
        imageResId = R.drawable.day14_image
    ),
    WebdevData(
        dayNumber = "Day 15",
        title = "Color Theory and Background",
        description = "Apply color theory in web design and set background colors and images.",
        imageResId = R.drawable.day15_image
    ),
    WebdevData(
        dayNumber = "Day 16",
        title = "Flexing Layouts with Flexbox",
        description = "Use CSS Flexbox to build flexible and responsive layouts.",
        imageResId = R.drawable.day16_image
    ),
    WebdevData(
        dayNumber = "Day 17",
        title = "Perfecting Links and Buttons",
        description = "Style links and buttons to make them intuitive and visually engaging.",
        imageResId = R.drawable.day17_image
    ),
    WebdevData(
        dayNumber = "Day 18",
        title = "Grid Layout Mastery",
        description = "Employ CSS Grid to create complex and responsive layouts effortlessly.",
        imageResId = R.drawable.day18_image
    ),
    WebdevData(
        dayNumber = "Day 19",
        title = "Mastering CSS Positioning",
        description = "Learn various positioning techniques to place elements exactly where you want them.",
        imageResId = R.drawable.day19_image
    ),
    WebdevData(
        dayNumber = "Day 20",
        title = "Introduction to Responsive Web Design",
        description = "Understand the principles of responsive design to make your site mobile-friendly.n",
        imageResId = R.drawable.day20_image
    ),
    WebdevData(
        dayNumber = "Day 21",
        title = "Making It Fit: Media Queries",
        description = "Use media queries to adapt your designs to different screen sizes.",
        imageResId = R.drawable.day21_image
    ),
    WebdevData(
        dayNumber = "Day 22",
        title = "Dynamic Design with Pseudo-classes and Pseudo-elements",
        description = "Learn to style elements in particular states and create special effects.",
        imageResId = R.drawable.day22_image
    ),
    WebdevData(
        dayNumber = "Day 23",
        title = "Animating User Experience",
        description = "Add subtle animations to improve user experience and guide focus.",
        imageResId = R.drawable.day23_image
    ),
    WebdevData(
        dayNumber = "Day 24",
        title = "Advanced CSS Animations",
        description = "Create complex animations using keyframes for interactive storytelling.",
        imageResId = R.drawable.day24_image
    ),
    WebdevData(
        dayNumber = "Day 25",
        title = "Targeted Styling with Advanced CSS Selectors",
        description = "Get granular with your styles using attribute, sibling, and pseudo-class selectors.",
        imageResId = R.drawable.day25_image
    ),
    WebdevData(
        dayNumber = "Day 26",
        title = "Custom Fonts and Typography",
        description = "Enhance your web design with custom web fonts and typography rules.",
        imageResId = R.drawable.day26_image
    ),
    WebdevData(
        dayNumber = "Day 27",
        title = "Iconography with Font Awesome",
        description = "Incorporate Font Awesome icons to convey information and actions visually.",
        imageResId = R.drawable.day27_image
    ),
    WebdevData(
        dayNumber = "Day 28",
        title = "Ensuring Your Site Looks Good Everywhere",
        description = "Test and tweak your website to look great across all major web browsers.",
        imageResId = R.drawable.day28_image
    ),
    WebdevData(
        dayNumber = "Day 29",
        title = "Keeping It Together: File Structure and Site Organization",
        description = "Adopt a clean and organized file structure for maintainability and scalability.",
        imageResId = R.drawable.day29_image
    ),
    WebdevData(
        dayNumber = "Day 30",
        title = "Capstone Project: Building a Complete Web Page",
        description = "Pull together all the skills you've learned to build and deploy a personal or portfolio website.",
        imageResId = R.drawable.day30_image
    )
)
