package com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: FilterScreenTypes.kt */
/* loaded from: classes2.dex */
public abstract class FilterScreenTypes implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final FilterViewType f29233a;

    /* compiled from: FilterScreenTypes.kt */
    /* loaded from: classes2.dex */
    public static final class InPlace extends FilterScreenTypes {
        public static final Parcelable.Creator<InPlace> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final FilterViewType f29234b;

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<InPlace> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final InPlace createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new InPlace((FilterViewType) parcel.readParcelable(InPlace.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final InPlace[] newArray(int i11) {
                return new InPlace[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InPlace(FilterViewType filterViewType) {
            super(filterViewType, null);
            o.i(filterViewType, "filterViewType");
            this.f29234b = filterViewType;
        }

        @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes
        public FilterViewType a() {
            return this.f29234b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof InPlace) && o.d(this.f29234b, ((InPlace) obj).f29234b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f29234b.hashCode();
        }

        public String toString() {
            FilterViewType filterViewType = this.f29234b;
            return "InPlace(filterViewType=" + filterViewType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeParcelable(this.f29234b, i11);
        }
    }

    /* compiled from: FilterScreenTypes.kt */
    /* loaded from: classes2.dex */
    public static final class NewScreen extends FilterScreenTypes {
        public static final Parcelable.Creator<NewScreen> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29235b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f29236c;

        /* renamed from: d  reason: collision with root package name */
        private final FilterViewType f29237d;

        /* renamed from: e  reason: collision with root package name */
        private final FilterPlaces f29238e;

        /* compiled from: FilterScreenTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<NewScreen> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final NewScreen createFromParcel(Parcel parcel) {
                boolean z11;
                o.i(parcel, "parcel");
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                return new NewScreen(z11, z12, (FilterViewType) parcel.readParcelable(NewScreen.class.getClassLoader()), FilterPlaces.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final NewScreen[] newArray(int i11) {
                return new NewScreen[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewScreen(boolean z11, boolean z12, FilterViewType filterViewType, FilterPlaces openedFrom) {
            super(filterViewType, null);
            o.i(filterViewType, "filterViewType");
            o.i(openedFrom, "openedFrom");
            this.f29235b = z11;
            this.f29236c = z12;
            this.f29237d = filterViewType;
            this.f29238e = openedFrom;
        }

        @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes
        public FilterViewType a() {
            return this.f29237d;
        }

        public final boolean b() {
            return this.f29235b;
        }

        public final FilterPlaces c() {
            return this.f29238e;
        }

        public final boolean d() {
            return this.f29236c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewScreen)) {
                return false;
            }
            NewScreen newScreen = (NewScreen) obj;
            if (this.f29235b == newScreen.f29235b && this.f29236c == newScreen.f29236c && o.d(this.f29237d, newScreen.f29237d) && this.f29238e == newScreen.f29238e) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z11 = this.f29235b;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            boolean z12 = this.f29236c;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return ((((i12 + i11) * 31) + this.f29237d.hashCode()) * 31) + this.f29238e.hashCode();
        }

        public String toString() {
            boolean z11 = this.f29235b;
            boolean z12 = this.f29236c;
            FilterViewType filterViewType = this.f29237d;
            FilterPlaces filterPlaces = this.f29238e;
            return "NewScreen(hasSearch=" + z11 + ", isGrouped=" + z12 + ", filterViewType=" + filterViewType + ", openedFrom=" + filterPlaces + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.f29235b ? 1 : 0);
            out.writeInt(this.f29236c ? 1 : 0);
            out.writeParcelable(this.f29237d, i11);
            out.writeString(this.f29238e.name());
        }
    }

    public /* synthetic */ FilterScreenTypes(FilterViewType filterViewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterViewType);
    }

    public FilterViewType a() {
        return this.f29233a;
    }

    private FilterScreenTypes(FilterViewType filterViewType) {
        this.f29233a = filterViewType;
    }
}
