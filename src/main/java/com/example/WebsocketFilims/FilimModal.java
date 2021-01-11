package com.example.WebsocketFilims;

import java.util.Date;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "filim")
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class FilimModal {
	
	
	@Id
	private int id;
	
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private String Name;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private String Description;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date Realease;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private int Rating;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private int TicketPrice;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private String Country;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private String Genre;
	@ApiModelProperty(notes = "Example:  \"matlNo\": \"BCDEFG\",", required = true)
	private Binary Photo;


}
