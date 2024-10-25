package com.forsale.app.utils.analytics;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f40027a;

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static abstract class a extends l {

        /* compiled from: Models.kt */
        /* renamed from: com.forsale.app.utils.analytics.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0455a extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final C0455a f40028b = new C0455a();

            private C0455a() {
                super("Image Media Actions", null);
            }
        }

        /* compiled from: Models.kt */
        /* loaded from: classes3.dex */
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f40029b = new b();

            private b() {
                super("Video Media Actions", null);
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            super(str, null);
        }
    }

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static abstract class b extends l {

        /* compiled from: Models.kt */
        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final a f40030b = new a();

            private a() {
                super("PLF Media", null);
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private b(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ l(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f40027a;
    }

    private l(String str) {
        this.f40027a = str;
    }
}
