/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package se.jobtech.sokannonser.service;

import org.springframework.web.bind.annotation.*;
import se.jobtech.sokannonser.dtos.Annonssvar;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-15T17:50:24.737+01:00")

@Api(value = "sok", description = "the sok API")
public interface SokApi {

    @ApiOperation(value = "", notes = "", response = Annonssvar.class, tags={ "sokannonser", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Annonssvar.class),
        @ApiResponse(code = 401, message = "Felaktig API-nyckel", response = Void.class),
        @ApiResponse(code = 500, message = "Bad", response = Void.class) })
    @RequestMapping(value = "/sok",
        produces = { "application/json" },
        method = RequestMethod.GET)
    @CrossOrigin(maxAge = 6000)
    ResponseEntity<Annonssvar> getSearch(@ApiParam(value = "Nyckel som krävs för att använda API:et" ,required=true, defaultValue="apa") @RequestHeader(value="api-key", required=true) String apiKey, @Min(0) @Max(2000)@ApiParam(value = "Börja lista resultat från denna position (0-2000)", defaultValue = "0") @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset, @Min(0) @Max(1000)@ApiParam(value = "Antal resultat att visa (0-1000)", defaultValue = "10") @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@ApiParam(value = "Sortering. pubdate-desc: publiceringsdatum, nyast först pubdate-asc: publiceringsdatum, äldst först applydate-desc: sista ansökningsdatum, nyast först applydate-asc: sista ansökningsdatum, äldst först relevance: Relevans (poäng)", allowableValues = "relevance, pubdate-desc, pubdate-asc, applydate-desc, applydate-asc") @RequestParam(value = "sortera", required = false) String sortera,@ApiParam(value = "Visa annonser publicerade innan angivet datum (på formen YYYY-mm-ddTHH:MM:SS)") @RequestParam(value = "publicerad-innan", required = false) String publiceradInnan,@ApiParam(value = "Visa annonser publicerade efter angivet datum (på formen YYYY-mm-ddTHH:MM:SS)") @RequestParam(value = "publicerad-efter", required = false) String publiceradEfter,@ApiParam(value = "Fritextfråga") @RequestParam(value = "q", required = false) String q,@ApiParam(value = "Ge förslag på sökord utifrån nuvarande sökning (type head)") @RequestParam(value = "typehead", required = false) String typehead,@ApiParam(value = "En eller flera yrkesbenämningskoder enligt taxonomi") @RequestParam(value = "yrkesroll", required = false) List<String> yrkesroll,@ApiParam(value = "En eller flera yrkesgruppskoder enligt taxonomi") @RequestParam(value = "yrkesgrupp", required = false) List<String> yrkesgrupp,@ApiParam(value = "En eller flera yrkesområdeskoder enligt taxonomi") @RequestParam(value = "yrkesomrade", required = false) List<String> yrkesomrade,@ApiParam(value = "En eller flera kompetenskoder enligt taxonomi") @RequestParam(value = "kompetens", required = false) List<String> kompetens,@ApiParam(value = "En eller flera arbetstidsomfattningskoder enligt taxonomi") @RequestParam(value = "arbetstidsomfattning", required = false) List<String> arbetstidsomfattning,@ApiParam(value = "Typ av körkort som efterfrågas (taxonomikod)") @RequestParam(value = "korkort", required = false) List<String> korkort,@ApiParam(value = "Anställningstyp enligt taxonomi") @RequestParam(value = "anstallningstyp", required = false) List<String> anstallningstyp,@ApiParam(value = "Visa enbart jobb som inte kräver erfarenhet", defaultValue = "false") @RequestParam(value = "utan-erfarenhet", required = false, defaultValue="false") Boolean utanErfarenhet,@ApiParam(value = "En eller flera kommunkoder") @RequestParam(value = "kommun", required = false) List<String> kommun,@ApiParam(value = "En eller flera länskoder") @RequestParam(value = "lan", required = false) List<String> lan,@ApiParam(value = "Resultatmodell", allowableValues = "pbapi, simple") @RequestParam(value = "resultatmodell", required = false) String resultatmodell,@ApiParam(value = "Sök bland AF:s annonser eller alla på marknaden (auranest)", allowableValues = "arbetsförmedlingen, auranest", defaultValue = "arbetsförmedlingen") @RequestParam(value = "dataset", required = false, defaultValue="arbetsförmedlingen") String dataset);

}
