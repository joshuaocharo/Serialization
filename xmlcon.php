<?php
$con=mysqli_connect('localhost','root','','students');
$fire=mysqli_query($con,"SELECT * FROM students");

$xml=new XMLWriter();
$xml->openURI("php://output");
$xml->startDocument();
$xml->setIndent(true);
$xml->startElement('Group');
    while($row=mysqli_fetch_assoc($fire))
    {
        $xml->startElement('Student');
            $xml->startElement('StudentID');
            $xml->writeRaw($row['ID']);
            $xml->endElement();
            $xml->startElement('Name');
            $xml->writeRaw($row['Name']);
            $xml->endElement();
            $xml->startElement('Course');
            $xml->writeRaw($row['Course']);
            $xml->endElement();
            $xml->startElement('Year');
            $xml->writeRaw($row['Year']);
            $xml->endElement();
            
            
        $xml->endElement();

    }
$xml->endElement();
header('Content-type: text/xml');
$xml->flush();

?>