package com.bharti.marsrover.domain;

// An enum that represents direction and four possible direction value. 
// Each direction is aware of the direction on it's left and right.
public enum Direction {	
	E{
		@Override
		public Direction left() {
			return N;
		}
		
		@Override
		public Direction right() {
			return S;
		}
	},
	
	W{
		@Override
		public Direction left() {
			return S;
		}
		
		@Override
		public Direction right() {
			return N;
		}	
	},
	
	N{
		@Override
		public Direction left() {
			return W;
		}
		
		@Override
		public Direction right() {
			return E;
		}	
	},
	
	S{
		@Override
		public Direction left() {
			return E;
		}
		
		@Override
		public Direction right() {
			return W;
		}	
	};
	
	public abstract Direction left();
	public abstract Direction right();
}