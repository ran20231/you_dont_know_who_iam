package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.SortingStates;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CategorySortingEvents.kt */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final SortingStates f28698a;

    /* compiled from: CategorySortingEvents.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        private final SortingStates f28699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SortingStates sortingState) {
            super(sortingState, null);
            o.i(sortingState, "sortingState");
            this.f28699b = sortingState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f28699b == ((a) obj).f28699b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f28699b.hashCode();
        }

        public String toString() {
            SortingStates sortingStates = this.f28699b;
            return "OpenSortingOptionBottomSheet(sortingState=" + sortingStates + ")";
        }
    }

    /* compiled from: CategorySortingEvents.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        private final SortingStates f28700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SortingStates sortingState) {
            super(sortingState, null);
            o.i(sortingState, "sortingState");
            this.f28700b = sortingState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f28700b == ((b) obj).f28700b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f28700b.hashCode();
        }

        public String toString() {
            SortingStates sortingStates = this.f28700b;
            return "SelectSortingOption(sortingState=" + sortingStates + ")";
        }
    }

    public /* synthetic */ f(SortingStates sortingStates, DefaultConstructorMarker defaultConstructorMarker) {
        this(sortingStates);
    }

    public final SortingStates a() {
        return this.f28698a;
    }

    private f(SortingStates sortingStates) {
        this.f28698a = sortingStates;
    }
}
