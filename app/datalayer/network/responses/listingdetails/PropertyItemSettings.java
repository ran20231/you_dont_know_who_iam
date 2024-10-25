package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PropertyItemSettings.kt */
/* loaded from: classes2.dex */
public final class PropertyItemSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isForSaleRealtyPinned;
    private final boolean isProperty;

    /* compiled from: PropertyItemSettings.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* compiled from: PropertyItemSettings.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CategoryEntity.Classification.values().length];
                try {
                    iArr[CategoryEntity.Classification.PROPERTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[UserType.values().length];
                try {
                    iArr2[UserType.FOR_SALE_REALTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isItemForSaleRealty(UserType userType) {
            int i11;
            if (userType == null) {
                i11 = -1;
            } else {
                i11 = WhenMappings.$EnumSwitchMapping$1[userType.ordinal()];
            }
            if (i11 == 1) {
                return true;
            }
            return false;
        }

        public final boolean isItemProperty(CategoryEntity categoryEntity) {
            CategoryEntity.Classification classification;
            int i11;
            if (categoryEntity != null) {
                classification = categoryEntity.getClassification();
            } else {
                classification = null;
            }
            if (classification == null) {
                i11 = -1;
            } else {
                i11 = WhenMappings.$EnumSwitchMapping$0[classification.ordinal()];
            }
            if (i11 == 1) {
                return true;
            }
            return false;
        }
    }

    public PropertyItemSettings() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ PropertyItemSettings copy$default(PropertyItemSettings propertyItemSettings, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = propertyItemSettings.isProperty;
        }
        if ((i11 & 2) != 0) {
            z12 = propertyItemSettings.isForSaleRealtyPinned;
        }
        return propertyItemSettings.copy(z11, z12);
    }

    public final boolean component1() {
        return this.isProperty;
    }

    public final boolean component2() {
        return this.isForSaleRealtyPinned;
    }

    public final PropertyItemSettings copy(boolean z11, boolean z12) {
        return new PropertyItemSettings(z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyItemSettings)) {
            return false;
        }
        PropertyItemSettings propertyItemSettings = (PropertyItemSettings) obj;
        if (this.isProperty == propertyItemSettings.isProperty && this.isForSaleRealtyPinned == propertyItemSettings.isForSaleRealtyPinned) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.isProperty;
        int i11 = 1;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        boolean z12 = this.isForSaleRealtyPinned;
        if (!z12) {
            i11 = z12 ? 1 : 0;
        }
        return i12 + i11;
    }

    public final boolean isForSaleRealtyPinned() {
        return this.isForSaleRealtyPinned;
    }

    public final boolean isProperty() {
        return this.isProperty;
    }

    public String toString() {
        boolean z11 = this.isProperty;
        boolean z12 = this.isForSaleRealtyPinned;
        return "PropertyItemSettings(isProperty=" + z11 + ", isForSaleRealtyPinned=" + z12 + ")";
    }

    public PropertyItemSettings(boolean z11, boolean z12) {
        this.isProperty = z11;
        this.isForSaleRealtyPinned = z12;
    }

    public /* synthetic */ PropertyItemSettings(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
