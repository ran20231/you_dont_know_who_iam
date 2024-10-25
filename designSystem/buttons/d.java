package com.forsale.designSystem.buttons;

import b1.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final long f41207a;

        public /* synthetic */ a(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public final long a() {
            return this.f41207a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && t1.q(this.f41207a, ((a) obj).f41207a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return t1.w(this.f41207a);
        }

        public String toString() {
            return "Filled(filledColor=" + ((Object) t1.x(this.f41207a)) + ')';
        }

        private a(long j11) {
            super(null);
            this.f41207a = j11;
        }
    }

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final long f41208a;

        public final long a() {
            return this.f41208a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && t1.q(this.f41208a, ((b) obj).f41208a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return t1.w(this.f41208a);
        }

        public String toString() {
            return "Outline(borderColor=" + ((Object) t1.x(this.f41208a)) + ')';
        }
    }

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41209a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public int hashCode() {
            return -1050366269;
        }

        public String toString() {
            return "Standard";
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
