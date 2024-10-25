package com.forsale.app.routing.deeplinks.processors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import kotlin.jvm.internal.o;
/* compiled from: CategoriesLinkProcessor.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: CategoriesLinkProcessor.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final int f37775a;

        public a(int i11) {
            this.f37775a = i11;
        }

        public final int a() {
            return this.f37775a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f37775a == ((a) obj).f37775a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37775a);
        }

        public String toString() {
            int i11 = this.f37775a;
            return "Category(categoryId=" + i11 + ")";
        }
    }

    /* compiled from: CategoriesLinkProcessor.kt */
    /* renamed from: com.forsale.app.routing.deeplinks.processors.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0433b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f37776a;

        /* renamed from: b  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f37777b;

        public C0433b(CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData) {
            o.i(categoryEntity, "categoryEntity");
            this.f37776a = categoryEntity;
            this.f37777b = filtrationData;
        }

        public final CategoryEntity a() {
            return this.f37776a;
        }

        public final GetListingsBody.FiltrationData b() {
            return this.f37777b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0433b)) {
                return false;
            }
            C0433b c0433b = (C0433b) obj;
            if (o.d(this.f37776a, c0433b.f37776a) && o.d(this.f37777b, c0433b.f37777b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f37776a.hashCode() * 31;
            GetListingsBody.FiltrationData filtrationData = this.f37777b;
            if (filtrationData == null) {
                hashCode = 0;
            } else {
                hashCode = filtrationData.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f37776a;
            GetListingsBody.FiltrationData filtrationData = this.f37777b;
            return "CategoryListings(categoryEntity=" + categoryEntity + ", filtrationData=" + filtrationData + ")";
        }
    }
}
