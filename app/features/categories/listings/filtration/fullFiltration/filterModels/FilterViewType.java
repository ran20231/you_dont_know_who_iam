package com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: FilterScreenTypes.kt */
/* loaded from: classes2.dex */
public interface FilterViewType extends Parcelable {

    /* compiled from: FilterScreenTypes.kt */
    /* loaded from: classes2.dex */
    public static final class Bool implements FilterViewType {

        /* renamed from: a  reason: collision with root package name */
        public static final Bool f29239a = new Bool();
        public static final Parcelable.Creator<Bool> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f29240b = 8;

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Bool> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Bool createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                parcel.readInt();
                return Bool.f29239a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Bool[] newArray(int i11) {
                return new Bool[i11];
            }
        }

        private Bool() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(1);
        }
    }

    /* compiled from: FilterScreenTypes.kt */
    /* loaded from: classes2.dex */
    public static abstract class FilterSelectionViewType implements FilterViewType {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f29241a;

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class Horizontal extends FilterSelectionViewType {
            public static final Parcelable.Creator<Horizontal> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public static final int f29242c = 8;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f29243b;

            /* compiled from: FilterScreenTypes.kt */
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Horizontal> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final Horizontal createFromParcel(Parcel parcel) {
                    boolean z11;
                    o.i(parcel, "parcel");
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new Horizontal(z11);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final Horizontal[] newArray(int i11) {
                    return new Horizontal[i11];
                }
            }

            public Horizontal(boolean z11) {
                super(z11, null);
                this.f29243b = z11;
            }

            @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType
            public boolean a() {
                return this.f29243b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Horizontal) && this.f29243b == ((Horizontal) obj).f29243b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f29243b;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f29243b;
                return "Horizontal(isSingleSelection=" + z11 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(this.f29243b ? 1 : 0);
            }
        }

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class Vertical extends FilterSelectionViewType {
            public static final Parcelable.Creator<Vertical> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public static final int f29244c = 8;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f29245b;

            /* compiled from: FilterScreenTypes.kt */
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Vertical> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final Vertical createFromParcel(Parcel parcel) {
                    boolean z11;
                    o.i(parcel, "parcel");
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return new Vertical(z11);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final Vertical[] newArray(int i11) {
                    return new Vertical[i11];
                }
            }

            public Vertical(boolean z11) {
                super(z11, null);
                this.f29245b = z11;
            }

            @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType
            public boolean a() {
                return this.f29245b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Vertical) && this.f29245b == ((Vertical) obj).f29245b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f29245b;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f29245b;
                return "Vertical(isSingleSelection=" + z11 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(this.f29245b ? 1 : 0);
            }
        }

        public /* synthetic */ FilterSelectionViewType(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11);
        }

        public boolean a() {
            return this.f29241a;
        }

        private FilterSelectionViewType(boolean z11) {
            this.f29241a = z11;
        }
    }

    /* compiled from: FilterScreenTypes.kt */
    /* loaded from: classes2.dex */
    public static abstract class Range implements FilterViewType {

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class Price extends Range {

            /* renamed from: a  reason: collision with root package name */
            public static final Price f29246a = new Price();
            public static final Parcelable.Creator<Price> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            public static final int f29247b = 8;

            /* compiled from: FilterScreenTypes.kt */
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Price> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final Price createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    parcel.readInt();
                    return Price.f29246a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final Price[] newArray(int i11) {
                    return new Price[i11];
                }
            }

            private Price() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(1);
            }
        }

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class RangedAttribute extends Range {

            /* renamed from: a  reason: collision with root package name */
            public static final RangedAttribute f29248a = new RangedAttribute();
            public static final Parcelable.Creator<RangedAttribute> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            public static final int f29249b = 8;

            /* compiled from: FilterScreenTypes.kt */
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<RangedAttribute> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final RangedAttribute createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    parcel.readInt();
                    return RangedAttribute.f29248a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final RangedAttribute[] newArray(int i11) {
                    return new RangedAttribute[i11];
                }
            }

            private RangedAttribute() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(1);
            }
        }

        private Range() {
        }

        public /* synthetic */ Range(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
