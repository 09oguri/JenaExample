package jena.examples.vocabulary;

/* CVS $Id: $ */

import com.hp.hpl.jena.rdf.model.*;

/**
 * Vocabulary definitions from CRM.rdf
 * 
 * @author Auto-generated by schemagen on 12 9 2014 14:24
 */
public class CRM {
	/**
	 * <p>
	 * The RDF model that holds the vocabulary terms
	 * </p>
	 */
	private static Model m_model = ModelFactory.createDefaultModel();

	/**
	 * <p>
	 * The namespace of the vocabulary as a string
	 * </p>
	 */
	public static final String NS = "http://purl.org/NET/cidoc-crm/core#";

	/**
	 * <p>
	 * The namespace of the vocabulary as a string
	 * </p>
	 * 
	 * @see #NS
	 */
	public static String getURI() {
		return NS;
	}

	/**
	 * <p>
	 * The namespace of the vocabulary as a resource
	 * </p>
	 */
	public static final Resource NAMESPACE = m_model.createResource(NS);

	public static final Property P100_was_death_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P100_was_death_of");

	public static final Property P101_had_as_general_use = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P101_had_as_general_use");

	/**
	 * <p>
	 * Properties: P102.1 has type: E55 Type
	 * </p>
	 */
	public static final Property P102_has_title = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P102_has_title");

	public static final Property P103_was_intended_for = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P103_was_intended_for");

	public static final Property P104_is_subject_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P104_is_subject_to");

	public static final Property P105_right_held_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P105_right_held_by");

	public static final Property P106_is_composed_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P106_is_composed_of");

	/**
	 * <p>
	 * Properties: P107.1 kind of member: E55 Type
	 * </p>
	 */
	public static final Property P107_has_current_or_former_member = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P107_has_current_or_former_member");

	public static final Property P108_has_produced = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P108_has_produced");

	public static final Property P109_has_current_or_former_curator = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P109_has_current_or_former_curator");

	public static final Property P10_falls_within = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P10_falls_within");

	public static final Property P110_augmented = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P110_augmented");

	public static final Property P111_added = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P111_added");

	public static final Property P112_diminished = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P112_diminished");

	public static final Property P113_removed = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P113_removed");

	public static final Property P114_is_equal_in_time_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P114_is_equal_in_time_to");

	public static final Property P115_finishes = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P115_finishes");

	public static final Property P116_starts = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P116_starts");

	public static final Property P117_occurs_during = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P117_occurs_during");

	public static final Property P118_overlaps_in_time_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P118_overlaps_in_time_with");

	public static final Property P119_meets_in_time_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P119_meets_in_time_with");

	public static final Property P11_had_participant = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P11_had_participant");

	public static final Property P120_occurs_before = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P120_occurs_before");

	public static final Property P121_overlaps_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P121_overlaps_with");

	public static final Property P122_borders_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P122_borders_with");

	public static final Property P123_resulted_in = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P123_resulted_in");

	public static final Property P124_transformed = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P124_transformed");

	public static final Property P125_used_object_of_type = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P125_used_object_of_type");

	public static final Property P126_employed = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P126_employed");

	public static final Property P127_has_broader_term = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P127_has_broader_term");

	public static final Property P128_carries = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P128_carries");

	public static final Property P129_is_about = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P129_is_about");

	public static final Property P12_occurred_in_the_presence_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P12_occurred_in_the_presence_of");

	/**
	 * <p>
	 * Properties: P130.1 kind of similarity: E55 Type
	 * </p>
	 */
	public static final Property P130_shows_features_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P130_shows_features_of");

	public static final Property P131_is_identified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P131_is_identified_by");

	public static final Property P132_overlaps_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P132_overlaps_with");

	public static final Property P133_is_separated_from = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P133_is_separated_from");

	public static final Property P134_continued = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P134_continued");

	public static final Property P135_created_type = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P135_created_type");

	/**
	 * <p>
	 * Properties: P136.1 in the taxonomic role: E55 Type
	 * </p>
	 */
	public static final Property P136_was_based_on = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P136_was_based_on");

	/**
	 * <p>
	 * Properties: P137.1 in the taxonomic role: E55 Type
	 * </p>
	 */
	public static final Property P137_exemplifies = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P137_exemplifies");

	/**
	 * <p>
	 * Properties: P138.1 mode of representation: E55 Type
	 * </p>
	 */
	public static final Property P138_represents = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P138_represents");

	/**
	 * <p>
	 * Properties: P139.1 has type: E55 Type
	 * </p>
	 */
	public static final Property P139_has_alternative_form = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P139_has_alternative_form");

	public static final Property P13_destroyed = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P13_destroyed");

	public static final Property P140_assigned_attribute_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P140_assigned_attribute_to");

	public static final Property P141_assigned = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P141_assigned");

	public static final Property P142_used_constituent = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P142_used_constituent");

	public static final Property P143_joined = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P143_joined");

	/**
	 * <p>
	 * Properties: P144.1 kind of member: E55 Type
	 * </p>
	 */
	public static final Property P144_joined_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P144_joined_with");

	public static final Property P145_separated = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P145_separated");

	public static final Property P146_separated_from = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P146_separated_from");

	public static final Property P147_curated = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P147_curated");

	public static final Property P148_has_component = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P148_has_component");

	/**
	 * <p>
	 * Properties: P14.1 in the role of: E55 Type
	 * </p>
	 */
	public static final Property P14_carried_out_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P14_carried_out_by");

	public static final Property P15_was_influenced_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P15_was_influenced_by");

	/**
	 * <p>
	 * Properties: P16.1 mode of use: E55 Type
	 * </p>
	 */
	public static final Property P16_used_specific_object = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P16_used_specific_object");

	public static final Property P17_was_motivated_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P17_was_motivated_by");

	/**
	 * <p>
	 * Properties: P19.1 mode of use: E55 Type
	 * </p>
	 */
	public static final Property P19_was_intended_use_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P19_was_intended_use_of");

	public static final Property P1_is_identified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P1_is_identified_by");

	public static final Property P20_had_specific_purpose = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P20_had_specific_purpose");

	public static final Property P21_had_general_purpose = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P21_had_general_purpose");

	public static final Property P22_transferred_title_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P22_transferred_title_to");

	public static final Property P23_transferred_title_from = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P23_transferred_title_from");

	public static final Property P24_transferred_title_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P24_transferred_title_of");

	public static final Property P25_moved = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P25_moved");

	public static final Property P26_moved_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P26_moved_to");

	public static final Property P27_moved_from = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P27_moved_from");

	public static final Property P28_custody_surrendered_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P28_custody_surrendered_by");

	public static final Property P29_custody_received_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P29_custody_received_by");

	public static final Property P2_has_type = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P2_has_type");

	public static final Property P30_transferred_custody_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P30_transferred_custody_of");

	public static final Property P31_has_modified = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P31_has_modified");

	public static final Property P32_used_general_technique = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P32_used_general_technique");

	public static final Property P33_used_specific_technique = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P33_used_specific_technique");

	public static final Property P34_concerned = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P34_concerned");

	public static final Property P35_has_identified = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P35_has_identified");

	public static final Property P37_assigned = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P37_assigned");

	public static final Property P38_deassigned = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P38_deassigned");

	public static final Property P39_measured = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P39_measured");

	/**
	 * <p>
	 * Properties: P3.1 has type: E55 Type
	 * </p>
	 */
	public static final Property P3_has_note = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P3_has_note");

	public static final Property P40_observed_dimension = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P40_observed_dimension");

	public static final Property P41_classified = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P41_classified");

	public static final Property P42_assigned = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P42_assigned");

	public static final Property P43_has_dimension = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P43_has_dimension");

	public static final Property P44_has_condition = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P44_has_condition");

	public static final Property P45_consists_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P45_consists_of");

	public static final Property P46_is_composed_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P46_is_composed_of");

	public static final Property P48_has_preferred_identifier = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P48_has_preferred_identifier");

	public static final Property P49_has_former_or_current_keeper = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P49_has_former_or_current_keeper");

	public static final Property P4_has_time_span = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P4_has_time-span");

	public static final Property P50_has_current_keeper = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P50_has_current_keeper");

	public static final Property P51_has_former_or_current_owner = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P51_has_former_or_current_owner");

	public static final Property P52_has_current_owner = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P52_has_current_owner");

	public static final Property P53_has_former_or_current_location = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P53_has_former_or_current_location");

	public static final Property P54_has_current_permanent_location = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P54_has_current_permanent_location");

	public static final Property P55_has_current_location = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P55_has_current_location");

	public static final Property P56_bears_feature = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P56_bears_feature");

	public static final Property P57_has_number_of_parts = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P57_has_number_of_parts");

	public static final Property P58_has_section_definition = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P58_has_section_definition");

	public static final Property P59_has_section = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P59_has_section");

	public static final Property P5_consists_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P5_consists_of");

	/**
	 * <p>
	 * Properties: P62.1 mode of depiction: E55 Type
	 * </p>
	 */
	public static final Property P62_depicts = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P62_depicts");

	public static final Property P65_shows_visual_item = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P65_shows_visual_item");

	/**
	 * <p>
	 * Properties: P67.1 has type: E55 Type
	 * </p>
	 */
	public static final Property P67_refers_to = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P67_refers_to");

	public static final Property P68_foresees_use_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P68_foresees_use_of");

	/**
	 * <p>
	 * Properties: P69.1 has type: E55 Type
	 * </p>
	 */
	public static final Property P69_is_associated_with = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P69_is_associated_with");

	public static final Property P70_documents = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P70_documents");

	public static final Property P71_lists = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P71_lists");

	public static final Property P72_has_language = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P72_has_language");

	public static final Property P73_has_translation = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P73_has_translation");

	public static final Property P74_has_current_or_former_residence = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P74_has_current_or_former_residence");

	public static final Property P75_possesses = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P75_possesses");

	public static final Property P76_has_contact_point = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P76_has_contact_point");

	public static final Property P78_is_identified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P78_is_identified_by");

	public static final Property P79_beginning_is_qualified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P79_beginning_is_qualified_by");

	public static final Property P7_took_place_at = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P7_took_place_at");

	public static final Property P80_end_is_qualified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P80_end_is_qualified_by");

	public static final Property P81_ongoing_throughout = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P81_ongoing_throughout");

	public static final Property P82_at_some_time_within = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P82_at_some_time_within");

	public static final Property P83_had_at_least_duration = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P83_had_at_least_duration");

	public static final Property P84_had_at_most_duration = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P84_had_at_most_duration");

	public static final Property P86_falls_within = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P86_falls_within");

	public static final Property P87_is_identified_by = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P87_is_identified_by");

	public static final Property P88_consists_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P88_consists_of");

	public static final Property P89_falls_within = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P89_falls_within");

	public static final Property P8_took_place_on_or_within = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P8_took_place_on_or_within");

	public static final Property P90_has_value = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P90_has_value");

	public static final Property P91_has_unit = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P91_has_unit");

	public static final Property P92_brought_into_existence = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P92_brought_into_existence");

	public static final Property P93_took_out_of_existence = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P93_took_out_of_existence");

	public static final Property P94_has_created = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P94_has_created");

	public static final Property P95_has_formed = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P95_has_formed");

	public static final Property P96_by_mother = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P96_by_mother");

	public static final Property P97_from_father = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P97_from_father");

	public static final Property P98_brought_into_life = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P98_brought_into_life");

	public static final Property P99_dissolved = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P99_dissolved");

	public static final Property P9_consists_of = m_model
			.createProperty("http://purl.org/NET/cidoc-crm/core#P9_consists_of");

	public static final Resource E10_Transfer_of_Custody = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E10_Transfer_of_Custody");

	public static final Resource E11_Modification = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E11_Modification");

	public static final Resource E12_Production = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E12_Production");

	public static final Resource E13_Attribute_Assignment = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E13_Attribute_Assignment");

	public static final Resource E14_Condition_Assessment = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E14_Condition_Assessment");

	public static final Resource E15_Identifier_Assignment = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E15_Identifier_Assignment");

	public static final Resource E16_Measurement = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E16_Measurement");

	public static final Resource E17_Type_Assignment = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E17_Type_Assignment");

	public static final Resource E18_Physical_Thing = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E18_Physical_Thing");

	public static final Resource E19_Physical_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E19_Physical_Object");

	public static final Resource E1_CRM_Entity = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E1_CRM_Entity");

	public static final Resource E20_Biological_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E20_Biological_Object");

	public static final Resource E21_Person = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E21_Person");

	public static final Resource E22_Man_Made_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E22_Man-Made_Object");

	public static final Resource E24_Physical_Man_Made_Thing = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E24_Physical_Man-Made_Thing");

	public static final Resource E25_Man_Made_Feature = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E25_Man-Made_Feature");

	public static final Resource E26_Physical_Feature = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E26_Physical_Feature");

	public static final Resource E27_Site = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E27_Site");

	public static final Resource E28_Conceptual_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E28_Conceptual_Object");

	public static final Resource E29_Design_or_Procedure = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E29_Design_or_Procedure");

	public static final Resource E2_Temporal_Entity = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E2_Temporal_Entity");

	public static final Resource E30_Right = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E30_Right");

	public static final Resource E31_Document = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E31_Document");

	public static final Resource E32_Authority_Document = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E32_Authority_Document");

	public static final Resource E33_Linguistic_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E33_Linguistic_Object");

	public static final Resource E34_Inscription = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E34_Inscription");

	public static final Resource E35_Title = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E35_Title");

	public static final Resource E36_Visual_Item = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E36_Visual_Item");

	public static final Resource E37_Mark = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E37_Mark");

	public static final Resource E38_Image = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E38_Image");

	public static final Resource E39_Actor = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E39_Actor");

	public static final Resource E3_Condition_State = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E3_Condition_State");

	public static final Resource E40_Legal_Body = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E40_Legal_Body");

	public static final Resource E41_Appellation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E41_Appellation");

	public static final Resource E42_Identifier = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E42_Identifier");

	public static final Resource E44_Place_Appellation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E44_Place_Appellation");

	public static final Resource E45_Address = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E45_Address");

	public static final Resource E46_Section_Definition = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E46_Section_Definition");

	public static final Resource E47_Spatial_Coordinates = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E47_Spatial_Coordinates");

	public static final Resource E49_Time_Appellation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E49_Time_Appellation");

	public static final Resource E4_Period = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E4_Period");

	public static final Resource E50_Date = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E50_Date");

	public static final Resource E51_Contact_Point = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E51_Contact_Point");

	public static final Resource E52_Time_Span = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E52_Time-Span");

	public static final Resource E53_Place = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E53_Place");

	public static final Resource E54_Dimension = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E54_Dimension");

	public static final Resource E55_Type = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E55_Type");

	public static final Resource E56_Language = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E56_Language");

	public static final Resource E57_Material = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E57_Material");

	public static final Resource E58_Measurement_Unit = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E58_Measurement_Unit");

	public static final Resource E5_Event = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E5_Event");

	public static final Resource E63_Beginning_of_Existence = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E63_Beginning_of_Existence");

	public static final Resource E64_End_of_Existence = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E64_End_of_Existence");

	public static final Resource E65_Creation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E65_Creation");

	public static final Resource E66_Formation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E66_Formation");

	public static final Resource E67_Birth = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E67_Birth");

	public static final Resource E68_Dissolution = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E68_Dissolution");

	public static final Resource E69_Death = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E69_Death");

	public static final Resource E6_Destruction = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E6_Destruction");

	public static final Resource E70_Thing = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E70_Thing");

	public static final Resource E71_Man_Made_Thing = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E71_Man-Made_Thing");

	public static final Resource E72_Legal_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E72_Legal_Object");

	public static final Resource E73_Information_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E73_Information_Object");

	public static final Resource E74_Group = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E74_Group");

	public static final Resource E75_Conceptual_Object_Appellation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E75_Conceptual_Object_Appellation");

	public static final Resource E77_Persistent_Item = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E77_Persistent_Item");

	public static final Resource E78_Collection = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E78_Collection");

	public static final Resource E79_Part_Addition = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E79_Part_Addition");

	public static final Resource E7_Activity = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E7_Activity");

	public static final Resource E80_Part_Removal = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E80_Part_Removal");

	public static final Resource E81_Transformation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E81_Transformation");

	public static final Resource E82_Actor_Appellation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E82_Actor_Appellation");

	public static final Resource E83_Type_Creation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E83_Type_Creation");

	public static final Resource E84_Information_Carrier = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E84_Information_Carrier");

	public static final Resource E85_Joining = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E85_Joining");

	public static final Resource E86_Leaving = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E86_Leaving");

	public static final Resource E87_Curation_Activity = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E87_Curation_Activity");

	public static final Resource E89_Propositional_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E89_Propositional_Object");

	public static final Resource E8_Acquisition = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E8_Acquisition");

	public static final Resource E90_Symbolic_Object = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E90_Symbolic_Object");

	public static final Resource E9_Move = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#E9_Move");

	public static final Resource EntityNotation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#EntityNotation");

	public static final Resource PropertyNotation = m_model
			.createResource("http://purl.org/NET/cidoc-crm/core#PropertyNotation");

}
