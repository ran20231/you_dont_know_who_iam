package com.forsale.app.feedback;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeedbackUiModel.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: FeedbackUiModel.kt */
    /* renamed from: com.forsale.app.feedback.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0430a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f37456a;

        public C0430a(int i11) {
            super(null);
            this.f37456a = i11;
        }

        public final int a() {
            return this.f37456a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0430a) && this.f37456a == ((C0430a) obj).f37456a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37456a);
        }

        public String toString() {
            int i11 = this.f37456a;
            return "AnimatedIcon(iconRes=" + i11 + ")";
        }
    }

    /* compiled from: FeedbackUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f37457a;

        public b(int i11) {
            super(null);
            this.f37457a = i11;
        }

        public final int a() {
            return this.f37457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f37457a == ((b) obj).f37457a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37457a);
        }

        public String toString() {
            int i11 = this.f37457a;
            return "StaticIcon(iconRes=" + i11 + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
