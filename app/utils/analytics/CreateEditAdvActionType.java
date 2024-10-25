package com.forsale.app.utils.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class CreateEditAdvActionType implements wi.b {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ CreateEditAdvActionType[] $VALUES;
    public static final a Companion;
    private static final Map<String, CreateEditAdvActionType> map;
    private final String value;
    public static final CreateEditAdvActionType ADD_LISTING_VISITED = new CreateEditAdvActionType("ADD_LISTING_VISITED", 0, "Add Listing Visited");
    public static final CreateEditAdvActionType ADD_MAIN_INFORMATION_NEXT_CLICKED = new CreateEditAdvActionType("ADD_MAIN_INFORMATION_NEXT_CLICKED", 1, "Add Main Information Next Clicked");
    public static final CreateEditAdvActionType ADD_MORE_INFORMATION_VISITED = new CreateEditAdvActionType("ADD_MORE_INFORMATION_VISITED", 2, "Add More Information Visited");
    public static final CreateEditAdvActionType ADD_MORE_INFORMATION_NEXT_CLICKED = new CreateEditAdvActionType("ADD_MORE_INFORMATION_NEXT_CLICKED", 3, "Add More Information Next Clicked");
    public static final CreateEditAdvActionType ADD_SETTINGS_VISITED = new CreateEditAdvActionType("ADD_SETTINGS_VISITED", 4, "Add Settings Visited");
    public static final CreateEditAdvActionType ADD_SETTINGS_NEXT_CLICKED = new CreateEditAdvActionType("ADD_SETTINGS_NEXT_CLICKED", 5, "Add Settings Next Clicked");
    public static final CreateEditAdvActionType ADD_PLANS_VISITED = new CreateEditAdvActionType("ADD_PLANS_VISITED", 6, "Add Plans Visited");
    public static final CreateEditAdvActionType ADD_PLANS_NEXT_CLICKED = new CreateEditAdvActionType("ADD_PLANS_NEXT_CLICKED", 7, "Add Plans Next Clicked");
    public static final CreateEditAdvActionType ADD_LISTING_FEATURES_VISITED = new CreateEditAdvActionType("ADD_LISTING_FEATURES_VISITED", 8, "Add Listing Features Visited");
    public static final CreateEditAdvActionType UPLOAD_NEW_FREE_LISTING_STARTED = new CreateEditAdvActionType("UPLOAD_NEW_FREE_LISTING_STARTED", 9, "Upload New Free Listing Started");
    public static final CreateEditAdvActionType UPLOAD_NEW_PAID_LISTING_STARTED = new CreateEditAdvActionType("UPLOAD_NEW_PAID_LISTING_STARTED", 10, "Upload New Paid Listing Started");
    public static final CreateEditAdvActionType ADD_LISTING_SUCCEEDED = new CreateEditAdvActionType("ADD_LISTING_SUCCEEDED", 11, "Add Listing Succeeded");
    public static final CreateEditAdvActionType UPLOAD_NEW_LISTING_PENDING_PAY = new CreateEditAdvActionType("UPLOAD_NEW_LISTING_PENDING_PAY", 12, "Upload New Listing Pending Pay");
    public static final CreateEditAdvActionType UPLOAD_NEW_LISTING_FAILED = new CreateEditAdvActionType("UPLOAD_NEW_LISTING_FAILED", 13, "Upload New Listing Failed");
    public static final CreateEditAdvActionType UPLOAD_NEW_LISTING_IMAGES_SUCCEEDED = new CreateEditAdvActionType("UPLOAD_NEW_LISTING_IMAGES_SUCCEEDED", 14, "Upload New Listing Images Succeeded");
    public static final CreateEditAdvActionType UPLOAD_NEW_LISTING_IMAGES_FAILED = new CreateEditAdvActionType("UPLOAD_NEW_LISTING_IMAGES_FAILED", 15, "Upload New Listing Images Failed");
    public static final CreateEditAdvActionType ADD_LISTING_PLAN_SELECTED = new CreateEditAdvActionType("ADD_LISTING_PLAN_SELECTED", 16, "Add Listing Plan Selected");
    public static final CreateEditAdvActionType ADD_LISTING_ADDON_SELECTED = new CreateEditAdvActionType("ADD_LISTING_ADDON_SELECTED", 17, "Add Listing AddOn Selected");
    public static final CreateEditAdvActionType ADD_LISTING_ADDON_UNSELECTED = new CreateEditAdvActionType("ADD_LISTING_ADDON_UNSELECTED", 18, "Add Listing AddOn Unselected");
    public static final CreateEditAdvActionType ADD_LISTING_PROMOTION_SELECTED = new CreateEditAdvActionType("ADD_LISTING_PROMOTION_SELECTED", 19, "Add Listing Promotion Selected");
    public static final CreateEditAdvActionType ADD_LISTING_DRAFT_SAVED = new CreateEditAdvActionType("ADD_LISTING_DRAFT_SAVED", 20, "Add Listing Draft Saved");
    public static final CreateEditAdvActionType ADD_LISTING_PAYMENT_VISITED = new CreateEditAdvActionType("ADD_LISTING_PAYMENT_VISITED", 21, "Add Listing Payment Visited");
    public static final CreateEditAdvActionType EDIT_LISTING_VISITED = new CreateEditAdvActionType("EDIT_LISTING_VISITED", 22, "Edit Listing Visited");
    public static final CreateEditAdvActionType EDIT_MAIN_INFORMATION_NEXT_CLICKED = new CreateEditAdvActionType("EDIT_MAIN_INFORMATION_NEXT_CLICKED", 23, "Edit Main Information Next Clicked");
    public static final CreateEditAdvActionType EDIT_MORE_INFORMATION_VISITED = new CreateEditAdvActionType("EDIT_MORE_INFORMATION_VISITED", 24, "Edit More Information Visited");
    public static final CreateEditAdvActionType EDIT_MORE_INFORMATION_NEXT_CLICKED = new CreateEditAdvActionType("EDIT_MORE_INFORMATION_NEXT_CLICKED", 25, "Edit More Information Next Clicked");
    public static final CreateEditAdvActionType EDIT_SETTINGS_VISITED = new CreateEditAdvActionType("EDIT_SETTINGS_VISITED", 26, "Edit Settings Visited");
    public static final CreateEditAdvActionType EDIT_SETTINGS_NEXT_CLICKED = new CreateEditAdvActionType("EDIT_SETTINGS_NEXT_CLICKED", 27, "Edit Settings Next Clicked");
    public static final CreateEditAdvActionType EDIT_PLANS_VISITED = new CreateEditAdvActionType("EDIT_PLANS_VISITED", 28, "Edit Plans Visited");
    public static final CreateEditAdvActionType EDIT_PLANS_NEXT_CLICKED = new CreateEditAdvActionType("EDIT_PLANS_NEXT_CLICKED", 29, "Edit Plans Next Clicked");
    public static final CreateEditAdvActionType EDIT_LISTING_FEATURES_VISITED = new CreateEditAdvActionType("EDIT_LISTING_FEATURES_VISITED", 30, "Edit Listing Features Visited");
    public static final CreateEditAdvActionType EDIT_FREE_LISTING_STARTED = new CreateEditAdvActionType("EDIT_FREE_LISTING_STARTED", 31, "Edit Free Listing Started");
    public static final CreateEditAdvActionType EDIT_PAID_LISTING_STARTED = new CreateEditAdvActionType("EDIT_PAID_LISTING_STARTED", 32, "Edit Paid Listing Started");
    public static final CreateEditAdvActionType EDIT_FREE_LISTING_SUCCEEDED = new CreateEditAdvActionType("EDIT_FREE_LISTING_SUCCEEDED", 33, "Edit Free Listing Succeeded");
    public static final CreateEditAdvActionType EDIT_PAID_LISTING_SUCCEEDED = new CreateEditAdvActionType("EDIT_PAID_LISTING_SUCCEEDED", 34, "Edit Paid Listing Succeeded");
    public static final CreateEditAdvActionType EDIT_LISTING_PENDING_PAY = new CreateEditAdvActionType("EDIT_LISTING_PENDING_PAY", 35, "Edit Listing Pending Pay");
    public static final CreateEditAdvActionType EDIT_LISTING_FAILED = new CreateEditAdvActionType("EDIT_LISTING_FAILED", 36, "Edit Listing Failed");
    public static final CreateEditAdvActionType EDIT_LISTING_IMAGES_SUCCEEDED = new CreateEditAdvActionType("EDIT_LISTING_IMAGES_SUCCEEDED", 37, "Edit Listing Images Succeeded");
    public static final CreateEditAdvActionType EDIT_LISTING_IMAGES_FAILED = new CreateEditAdvActionType("EDIT_LISTING_IMAGES_FAILED", 38, "Edit Listing Images Failed");
    public static final CreateEditAdvActionType EDIT_LISTING_PLAN_SELECTED = new CreateEditAdvActionType("EDIT_LISTING_PLAN_SELECTED", 39, "Edit Listing Plan Selected");
    public static final CreateEditAdvActionType EDIT_LISTING_ADDON_SELECTED = new CreateEditAdvActionType("EDIT_LISTING_ADDON_SELECTED", 40, "Edit Listing Addon Selected");
    public static final CreateEditAdvActionType EDIT_LISTING_ADDON_UNSELECTED = new CreateEditAdvActionType("EDIT_LISTING_ADDON_UNSELECTED", 41, "Edit Listing Addon Unselected");
    public static final CreateEditAdvActionType EDIT_LISTING_PROMOTION_SELECTED = new CreateEditAdvActionType("EDIT_LISTING_PROMOTION_SELECTED", 42, "Edit Listing Promotion Selected");
    public static final CreateEditAdvActionType EDIT_LISTING_DRAFT_SAVED = new CreateEditAdvActionType("EDIT_LISTING_DRAFT_SAVED", 43, "Edit Listing Draft Saved");
    public static final CreateEditAdvActionType EDIT_LISTING_PAYMENT_VISITED = new CreateEditAdvActionType("EDIT_LISTING_PAYMENT_VISITED", 44, "Edit Listing Payment Visited");
    public static final CreateEditAdvActionType CREATE_ADV_REGISTRATION_CONVERTED = new CreateEditAdvActionType("CREATE_ADV_REGISTRATION_CONVERTED", 45, "CreateAdvRegistrationConverted");
    public static final CreateEditAdvActionType ADD_LISTING_CLOSE_CONFIRMATION_VIEWED = new CreateEditAdvActionType("ADD_LISTING_CLOSE_CONFIRMATION_VIEWED", 46, "Add Listing Close Confirmation Viewed");
    public static final CreateEditAdvActionType EDIT_LISTING_CLOSE_CONFIRMATION_VIEWED = new CreateEditAdvActionType("EDIT_LISTING_CLOSE_CONFIRMATION_VIEWED", 47, "Edit Listing Close Confirmation Viewed");
    public static final CreateEditAdvActionType ADD_LISTING_LEAVE_CLICKED = new CreateEditAdvActionType("ADD_LISTING_LEAVE_CLICKED", 48, "Add Listing Leave Clicked");
    public static final CreateEditAdvActionType EDIT_LISTING_LEAVE_CLICKED = new CreateEditAdvActionType("EDIT_LISTING_LEAVE_CLICKED", 49, "Edit Listing Leave Clicked");
    public static final CreateEditAdvActionType ADD_LISTING_STAY_CLICKED = new CreateEditAdvActionType("ADD_LISTING_STAY_CLICKED", 50, "Add Listing Stay Clicked");
    public static final CreateEditAdvActionType EDIT_LISTING_STAY_CLICKED = new CreateEditAdvActionType("EDIT_LISTING_STAY_CLICKED", 51, "Edit Listing Stay Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_ACTIONS_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_ACTIONS_CLICKED", 52, "Media Actions Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_EDIT_MEDIA_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_EDIT_MEDIA_CLICKED", 53, "Edit Media Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_REPLACE_VIDEO_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_REPLACE_VIDEO_CLICKED", 54, "Replace Video Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_DELETE_MEDIA_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_DELETE_MEDIA_CLICKED", 55, "Delete Media Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_CAPTURE_MEDIA_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_CAPTURE_MEDIA_CLICKED", 56, "Choose Media Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_CANCEL_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_CANCEL_CLICKED", 57, "Cancel Clicked");
    public static final CreateEditAdvActionType MEDIA_SCREEN_NEXT_CLICKED = new CreateEditAdvActionType("MEDIA_SCREEN_NEXT_CLICKED", 58, "Next Clicked");
    public static final CreateEditAdvActionType ADD_ADDON_CONFIRM_PAYMENT_CLICKED = new CreateEditAdvActionType("ADD_ADDON_CONFIRM_PAYMENT_CLICKED", 59, "Add Addon Confirm Payment Clicked");
    public static final CreateEditAdvActionType EDIT_ADDON_CONFIRM_PAYMENT_CLICKED = new CreateEditAdvActionType("EDIT_ADDON_CONFIRM_PAYMENT_CLICKED", 60, "Edit Addon Confirm Payment Clicked");
    public static final CreateEditAdvActionType ADD_BUNDLE_CHOOSE_ADDON_CLICKED = new CreateEditAdvActionType("ADD_BUNDLE_CHOOSE_ADDON_CLICKED", 61, "Add Bundle Choose Addon Clicked");
    public static final CreateEditAdvActionType EDIT_BUNDLE_CHOOSE_ADDON_CLICKED = new CreateEditAdvActionType("EDIT_BUNDLE_CHOOSE_ADDON_CLICKED", 62, "Edit Bundle Choose Addon Clicked");
    public static final CreateEditAdvActionType ADD_BUNDLE_CHECKOUT_CLICKED = new CreateEditAdvActionType("ADD_BUNDLE_CHECKOUT_CLICKED", 63, "Add Bundle Checkout Clicked");
    public static final CreateEditAdvActionType EDIT_BUNDLE_CHECKOUT_CLICKED = new CreateEditAdvActionType("EDIT_BUNDLE_CHECKOUT_CLICKED", 64, "Edit Bundle Checkout Clicked");
    public static final CreateEditAdvActionType BUNDLES_TO_OLD_EXPERIENCE_CLICKED = new CreateEditAdvActionType("BUNDLES_TO_OLD_EXPERIENCE_CLICKED", 65, "Bundles To Old Experience Clicked");

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreateEditAdvActionType a(String type) {
            o.i(type, "type");
            return (CreateEditAdvActionType) CreateEditAdvActionType.map.get(type);
        }
    }

    private static final /* synthetic */ CreateEditAdvActionType[] $values() {
        return new CreateEditAdvActionType[]{ADD_LISTING_VISITED, ADD_MAIN_INFORMATION_NEXT_CLICKED, ADD_MORE_INFORMATION_VISITED, ADD_MORE_INFORMATION_NEXT_CLICKED, ADD_SETTINGS_VISITED, ADD_SETTINGS_NEXT_CLICKED, ADD_PLANS_VISITED, ADD_PLANS_NEXT_CLICKED, ADD_LISTING_FEATURES_VISITED, UPLOAD_NEW_FREE_LISTING_STARTED, UPLOAD_NEW_PAID_LISTING_STARTED, ADD_LISTING_SUCCEEDED, UPLOAD_NEW_LISTING_PENDING_PAY, UPLOAD_NEW_LISTING_FAILED, UPLOAD_NEW_LISTING_IMAGES_SUCCEEDED, UPLOAD_NEW_LISTING_IMAGES_FAILED, ADD_LISTING_PLAN_SELECTED, ADD_LISTING_ADDON_SELECTED, ADD_LISTING_ADDON_UNSELECTED, ADD_LISTING_PROMOTION_SELECTED, ADD_LISTING_DRAFT_SAVED, ADD_LISTING_PAYMENT_VISITED, EDIT_LISTING_VISITED, EDIT_MAIN_INFORMATION_NEXT_CLICKED, EDIT_MORE_INFORMATION_VISITED, EDIT_MORE_INFORMATION_NEXT_CLICKED, EDIT_SETTINGS_VISITED, EDIT_SETTINGS_NEXT_CLICKED, EDIT_PLANS_VISITED, EDIT_PLANS_NEXT_CLICKED, EDIT_LISTING_FEATURES_VISITED, EDIT_FREE_LISTING_STARTED, EDIT_PAID_LISTING_STARTED, EDIT_FREE_LISTING_SUCCEEDED, EDIT_PAID_LISTING_SUCCEEDED, EDIT_LISTING_PENDING_PAY, EDIT_LISTING_FAILED, EDIT_LISTING_IMAGES_SUCCEEDED, EDIT_LISTING_IMAGES_FAILED, EDIT_LISTING_PLAN_SELECTED, EDIT_LISTING_ADDON_SELECTED, EDIT_LISTING_ADDON_UNSELECTED, EDIT_LISTING_PROMOTION_SELECTED, EDIT_LISTING_DRAFT_SAVED, EDIT_LISTING_PAYMENT_VISITED, CREATE_ADV_REGISTRATION_CONVERTED, ADD_LISTING_CLOSE_CONFIRMATION_VIEWED, EDIT_LISTING_CLOSE_CONFIRMATION_VIEWED, ADD_LISTING_LEAVE_CLICKED, EDIT_LISTING_LEAVE_CLICKED, ADD_LISTING_STAY_CLICKED, EDIT_LISTING_STAY_CLICKED, MEDIA_SCREEN_ACTIONS_CLICKED, MEDIA_SCREEN_EDIT_MEDIA_CLICKED, MEDIA_SCREEN_REPLACE_VIDEO_CLICKED, MEDIA_SCREEN_DELETE_MEDIA_CLICKED, MEDIA_SCREEN_CAPTURE_MEDIA_CLICKED, MEDIA_SCREEN_CANCEL_CLICKED, MEDIA_SCREEN_NEXT_CLICKED, ADD_ADDON_CONFIRM_PAYMENT_CLICKED, EDIT_ADDON_CONFIRM_PAYMENT_CLICKED, ADD_BUNDLE_CHOOSE_ADDON_CLICKED, EDIT_BUNDLE_CHOOSE_ADDON_CLICKED, ADD_BUNDLE_CHECKOUT_CLICKED, EDIT_BUNDLE_CHECKOUT_CLICKED, BUNDLES_TO_OLD_EXPERIENCE_CLICKED};
    }

    static {
        int e11;
        int d11;
        CreateEditAdvActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        CreateEditAdvActionType[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (CreateEditAdvActionType createEditAdvActionType : values) {
            linkedHashMap.put(createEditAdvActionType.getValue(), createEditAdvActionType);
        }
        map = linkedHashMap;
    }

    private CreateEditAdvActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<CreateEditAdvActionType> getEntries() {
        return $ENTRIES;
    }

    public static CreateEditAdvActionType valueOf(String str) {
        return (CreateEditAdvActionType) Enum.valueOf(CreateEditAdvActionType.class, str);
    }

    public static CreateEditAdvActionType[] values() {
        return (CreateEditAdvActionType[]) $VALUES.clone();
    }

    @Override // wi.b
    public String getValue() {
        return this.value;
    }
}
