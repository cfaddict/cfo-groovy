// Thanks to Brian Swartzfager for putting this one together
// 
//New date with current date/time
def date = new Date();
 
//Date format options
println date.format( 'EEEE, MMMM d, yyyy' )  // = Sunday, February 16, 2014
 
//Day options
println date.format( 'd' )    // = 16 ( day of month, no lead zeros )
println date.format( 'dd' )   // = 16 ( day of month, lead zero if needed )
println date.format( 'E' )    // = Sun  Note the switch to uppercase E instead of continuing lowercase d like CF does
println date.format( 'EEEE' ) // = Sunday
 
//Month options.  Note the use of uppercase M verses the lowercase m
println date.format( 'M' )    // = 2 ( month, no lead zeros )
println date.format( 'MM' )   // = 02 ( month, lead zero if needed )
println date.format( 'MMM' )  // = Feb
println date.format( 'MMMM' ) // = February
 
//Year options
println date.format( 'yy' )   // = 14 ( last 2 digits of year )
println date.format( 'yyyy' ) // = 2014
 
 
//Time-formatting options are also part of the Date format method
println date.format( 'HH:mm:ss a' ) // = 4:17:08 PM
 
//Hour options (1 - 24 and 1 - 12).  To do 0-23 or 0-11, switch to K/k
println date.format( 'H' )    // = 4 ( hour, no lead zeros )
println date.format( 'HH' )   // = 04 ( hour, lead zeros if needed )
println date.format( 'h' )    // = 16 ( hour, 24-hour style, no lead zeros )
println date.format( 'hh' )   // = 16 ( hour, 24-hour style, no lead zeros )
 
//Minute options
println date.format( 'm' )   // = 17 ( minute, no lead zeros )
println date.format( 'mm' )  // = 17 ( minute, lead zeros if needed )
 
//Second options
println date.format( 's' )   // = 8 ( second, no lead zeros )
println date.format( 'ss' )  // = 08 ( second, lead zeros if needed )
 
//AM/PM options
println date.format( 'a' )  // = PM  Lowercase 'a' instead of lowercase 't', and no single letter